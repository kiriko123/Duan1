/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.NhanVien;
import com.edusys.untis.XJDBC;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author tankh
 */
public class NhanVienDAO extends NuocHoaShopDAO<NhanVien, String>{
    String INSERT_SQL = "INSERT INTO nhanvien (manv, matkhau, tennv, email, diachi, gioitinh, vaitro) VALUES (?, ?, ?, ?,?,?,?)";
    String UPDATE_SQL = "UPDATE nhanvien SET matkhau = ?, tennv = ?, email = ?, diachi=?, gioitinh=?, vaitro=?, hinh = ?, isdelete=? WHERE manv = ?";
    String DELETE_SQL= "DELETE FROM nhanvien WHERE manv = ?";
    String SELECT_ALL_SQL ="SELECT * FROM nhanvien where isdelete = 0";
    String SELECT_BY_ID_SQL ="SELECT * FROM nhanvien WHERE manv = ? and isdelete = 0";
    
    
    @Override
    public void insert(NhanVien entity) {
        XJDBC.update(INSERT_SQL, 
                entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.getEmail(), entity.getDiaChi()
                    ,entity.isGioiTinh(), entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        XJDBC.update(UPDATE_SQL, 
                entity.getMatKhau(), entity.getHoTen(), entity.getEmail(),entity.getDiaChi(), entity.isGioiTinh()
                    , entity.isVaiTro(),entity.getHinh(),entity.isIsdelete(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        XJDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        else{
            return list.get(0);
        }
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBC.query(sql, args);
            while(rs.next()){
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("manv"));
                entity.setHoTen(rs.getString("tennv"));
                entity.setMatKhau(rs.getString("matkhau"));
                entity.setVaiTro(rs.getBoolean("vaitro"));
                entity.setEmail(rs.getString("email"));
                entity.setDiaChi(rs.getString("diachi"));
                entity.setGioiTinh(rs.getBoolean("gioitinh"));
                entity.setHinh(rs.getString("hinh"));
                entity.setIsdelete(rs.getBoolean("isdelete"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<NhanVien> selectByKeyword(String kw){
        String sql = "SELECT * FROM nhanvien WHERE (manv LIKE ? OR tennv LIKE N'%' + ? + '%' OR email LIKE ?) and isdelete = 0 ";
        return this.selectBySql(sql, "%" + kw + "%", kw, "%" + kw + "%");
    }
    public List<NhanVien> selectIsDelete(String kw){
         String sql = "SELECT * FROM nhanvien WHERE (manv LIKE ? OR tennv LIKE N'%' + ? + '%' OR email LIKE ?) and isdelete = 1 ";
        return this.selectBySql(sql, "%" + kw + "%", kw, "%" + kw + "%");
    }
    
}
