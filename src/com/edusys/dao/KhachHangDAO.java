/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.KhachHang;
import com.edusys.untis.XJDBC;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author tankh
 */
public class KhachHangDAO extends NuocHoaShopDAO<KhachHang, String>{
    String INSERT_SQL = "INSERT INTO khachhang (makh, tenkh, email, gioitinh, ngaysinh, diachi, manv) VALUES (?, ?, ?, ?,?,?,?)";
    String UPDATE_SQL = "UPDATE khachhang SET tenkh = ?, email = ?, gioitinh = ?, ngaysinh=?, diachi=?, manv=?, isdelete=? WHERE makh = ?";
    String DELETE_SQL= "DELETE FROM khachhang WHERE makh = ?";
    String SELECT_ALL_SQL ="SELECT * FROM khachhang";
    String SELECT_BY_ID_SQL ="SELECT * FROM khachhang WHERE makh = ? ";
    @Override
    public void insert(KhachHang entity) {
        XJDBC.update(INSERT_SQL, 
                entity.getMaKH(), entity.getTenKH(), entity.getEmail(), entity.isGioiTinh(), entity.getNgaySinh()
                    ,entity.getDiaChi(), entity.getMaNV());
    }

    @Override
    public void update(KhachHang entity) {
        XJDBC.update(UPDATE_SQL, 
                 entity.getTenKH(), entity.getEmail(), entity.isGioiTinh(), entity.getNgaySinh()
                    ,entity.getDiaChi(), entity.getMaNV(),entity.isIsdelete(), entity.getMaKH());
    }

    @Override
    public void delete(String id) {
        XJDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        else{
            return list.get(0);
        }
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBC.query(sql, args);
            while(rs.next()){
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("makh"));
                entity.setTenKH(rs.getString("tenkh"));
                entity.setMaNV(rs.getString("manv"));
                entity.setNgaySinh(rs.getDate("ngaysinh"));
                entity.setEmail(rs.getString("email"));
                entity.setDiaChi(rs.getString("diachi"));
                entity.setGioiTinh(rs.getBoolean("gioitinh"));
                entity.setIsdelete(rs.getBoolean("isdelete"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<KhachHang> selectByKeyword(String kw){
        String sql = "SELECT * FROM khachhang WHERE (makh LIKE ? OR tenkh LIKE N'%' + ? + '%' OR email LIKE ?) and isdelete = 0 ";
        return this.selectBySql(sql, "%" + kw + "%", kw, "%" + kw + "%");
    }
    
}
