/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.SanPham;
import com.edusys.untis.XJDBC;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author tankh
 */
public class SanPhamDAO extends NuocHoaShopDAO<SanPham, String>{
    String INSERT_SQL = "INSERT INTO sanpham  VALUES (?, ?, ?, ?,?,?,?,?,?,0)";
    String UPDATE_SQL = "UPDATE sanpham SET tensp = ?, tinhtrang = ?, ngaynhaphang=?, ghichu=?, giatien=?, manv=?, mamh=?,hinh=?,isdelete=? WHERE masp = ?";
    String DELETE_SQL= "DELETE FROM sanpham WHERE masp = ?";
    String SELECT_ALL_SQL ="SELECT * FROM sanpham";
    String SELECT_BY_ID_SQL ="SELECT * FROM sanpham WHERE masp = ?";
    @Override
    public void insert(SanPham entity) {
        XJDBC.update(INSERT_SQL, 
                entity.getMaSP(), entity.getTenSP(), entity.isTinhTrang(), entity.getNgayNhapHang(), entity.getGhiChu()
                    ,entity.getGiaTien(), entity.getMaNV(), entity.getMaMH(), entity.getHinh());
    }

    @Override
    public void update(SanPham entity) {
        XJDBC.update(UPDATE_SQL, 
                 entity.getTenSP(), entity.isTinhTrang(), entity.getNgayNhapHang(), entity.getGhiChu()
                    ,entity.getGiaTien(), entity.getMaNV(), entity.getMaMH(), entity.getHinh(),entity.isIsdelete(), entity.getMaSP());
    }

    @Override
    public void delete(String id) {
        XJDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public SanPham selectById(String id) {
        List<SanPham> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        else{
            return list.get(0);
        }
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBC.query(sql, args);
            while(rs.next()){
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getString("masp"));
                entity.setTenSP(rs.getString("tensp"));
                entity.setTinhTrang(rs.getBoolean("tinhtrang"));
                entity.setNgayNhapHang(rs.getDate("ngaynhaphang"));
                entity.setGhiChu(rs.getString("ghichu"));
                entity.setGiaTien(rs.getDouble("giatien"));
                entity.setMaNV(rs.getString("manv"));
                entity.setMaMH(rs.getString("mamh"));
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
    public List<SanPham> selectByKeyword(String kw){
        String sql = "SELECT * FROM sanpham WHERE masp LIKE ? OR tensp LIKE N'%' + ? + '%' OR mamh LIKE ? ";
        return this.selectBySql(sql, "%" + kw + "%", kw, "%" + kw + "%");
    }
    
    public List<SanPham> selectByMatHang(String mamh, String kw){
        String sql = "SELECT * FROM sanpham WHERE Mamh=? AND (masp LIKE ? OR tensp LIKE ? OR mamh LIKE ?) and isdelete = 0";
        return this.selectBySql(sql, mamh, "%" + kw + "%", "%" + kw + "%", kw);
}

}
