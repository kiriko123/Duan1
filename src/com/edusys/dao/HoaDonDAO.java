/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.HoaDon;
import com.edusys.untis.XJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tankh
 */
public class HoaDonDAO extends NuocHoaShopDAO<HoaDon, String>{
    String INSERT_SQL = "INSERT INTO hoadon VALUES (?, ?, ?, ?, ?, 0)";
    String UPDATE_SQL = "UPDATE hoadon SET ngayxuat = ?, ghichu = ?, makh = ?, manv=?, isdelete=? WHERE mahd = ?";
    String DELETE_SQL= "DELETE FROM hoadon WHERE mahd = ?";
    String SELECT_ALL_SQL ="SELECT * FROM hoadon";
    String SELECT_BY_ID_SQL ="SELECT * FROM hoadon WHERE mahd = ?";
    @Override
    public void insert(HoaDon entity) {
        XJDBC.update(INSERT_SQL, 
                entity.getMaHD(), entity.getNgayXuat(), entity.getGhiChu(), entity.getMaKH(), entity.getMaNV()
                    );
    }

    @Override
    public void update(HoaDon entity) {
        XJDBC.update(UPDATE_SQL, 
                  entity.getNgayXuat(), entity.getGhiChu(), entity.getMaKH(), entity.getMaNV(), entity.isIsdelete()
                    ,entity.getMaHD());
    }

    @Override
    public void delete(String id) {
        XJDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<HoaDon> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon selectById(String id) {
        List<HoaDon> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        else{
            return list.get(0);
        }
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBC.query(sql, args);
            while(rs.next()){
                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getString("mahd"));
                entity.setNgayXuat(rs.getDate("ngayxuat"));
                entity.setGhiChu(rs.getString("ghichu"));   
                entity.setMaKH(rs.getString("makh"));
                entity.setMaNV(rs.getString("manv"));
                entity.setIsdelete(rs.getBoolean("isdelete"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<HoaDon> selectByKeyword(String kw){
        String sql = "SELECT * FROM hoadon WHERE (manv LIKE ? OR makh LIKE N'%' + ? + '%' OR mahd LIKE ?) and isdelete = 0 ";
        return this.selectBySql(sql, "%" + kw + "%", kw, "%" + kw + "%");
    }
    
    public List<Integer> selectYears() {
        String sql="SELECT DISTINCT year(ngayxuat) Year FROM hoadon ORDER BY Year DESC";
        List<Integer> list=new ArrayList<>();
        try {
           ResultSet rs = XJDBC.query(sql);
           while(rs.next()){
                 list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
