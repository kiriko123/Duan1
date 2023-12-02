/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.MatHang;
import com.edusys.untis.XJDBC;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author tankh
 */
public class MatHangDAO extends NuocHoaShopDAO<MatHang, String>{
    String INSERT_SQL = "INSERT INTO loaihang  VALUES (?, ?, ?, ?, ?, ?, 0)";
    String UPDATE_SQL = "UPDATE loaihang SET tenmh = ?, xuatxu = ?, ghichu=?, hinh=?, mota=?, isdelete =? WHERE mamh = ?";
    String DELETE_SQL= "DELETE FROM loaihang WHERE mamh = ?";
    String SELECT_ALL_SQL ="SELECT * FROM loaihang";
    String SELECT_BY_ID_SQL ="SELECT * FROM loaihang WHERE mamh = ?";
    @Override
    public void insert(MatHang entity) {
        XJDBC.update(INSERT_SQL, 
                entity.getMamh(), entity.getTenmh(), entity.getXuatXu(), entity.getGhiChu(), entity.getHinh()
                    ,entity.getMoTa());
    }

    @Override
    public void update(MatHang entity) {
        XJDBC.update(UPDATE_SQL, 
                  entity.getTenmh(), entity.getXuatXu(), entity.getGhiChu(), entity.getHinh()
                    ,entity.getMoTa(),entity.isIsdelete(), entity.getMamh());
    }

    @Override
    public void delete(String id) {
        XJDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<MatHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public MatHang selectById(String id) {
        List<MatHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        else{
            return list.get(0);
        }
    }

    @Override
    protected List<MatHang> selectBySql(String sql, Object... args) {
        List<MatHang> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBC.query(sql, args);
            while(rs.next()){
                MatHang entity = new MatHang();
                entity.setMamh(rs.getString("mamh"));
                entity.setTenmh(rs.getString("tenmh"));
                entity.setXuatXu(rs.getString("xuatxu"));
                entity.setGhiChu(rs.getString("ghichu"));
                entity.setHinh(rs.getString("hinh"));
                entity.setMoTa(rs.getString("mota"));
                entity.setIsdelete(rs.getBoolean("isdelete"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<MatHang> selectByKeyword(String kw){
        String sql = "SELECT * FROM loaihang WHERE (mamh LIKE ? OR tenmh LIKE N'%' + ? + '%' OR xuatxu LIKE ?) and isdelete = 0 ";
        return this.selectBySql(sql, "%" + kw + "%", kw, "%" + kw + "%");
    }
}
