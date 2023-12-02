/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.ChiTietHoaDon;
import com.edusys.untis.XJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tankh
 */
public class ChiTietHoaDonDAO extends NuocHoaShopDAO<ChiTietHoaDon, String>{
    String INSERT_SQL = "INSERT INTO chitiethoadon VALUES (?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE chitiethoadon SET soluong = ?, ghichu = ? WHERE masp = ?";
    String DELETE_SQL= "DELETE FROM chitiethoadon WHERE masp = ?";
    String SELECT_ALL_SQL ="SELECT * FROM chitiethoadon";
    String SELECT_BY_ID_SQL ="SELECT * FROM chitiethoadon WHERE masp = ?";
    @Override
    public void insert(ChiTietHoaDon entity) {
        XJDBC.update(INSERT_SQL, 
                entity.getMaSP(), entity.getMaHD(), entity.getSoLuong(), entity.getGhiChu()
                    );
    }

    @Override
    public void update(ChiTietHoaDon entity) {
        XJDBC.update(UPDATE_SQL, 
                    entity.getSoLuong(), entity.getGhiChu(),entity.getMaSP()
                    );
    }

    @Override
    public void delete(String id) {
        XJDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<ChiTietHoaDon> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChiTietHoaDon selectById(String id) {
        List<ChiTietHoaDon> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        else{
            return list.get(0);
        }
    }

    @Override
    protected List<ChiTietHoaDon> selectBySql(String sql, Object... args) {
        List<ChiTietHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBC.query(sql, args);
            while(rs.next()){
                ChiTietHoaDon entity = new ChiTietHoaDon();
                entity.setMaHD(rs.getString("mahd"));
                entity.setMaSP(rs.getString("masp"));
                entity.setGhiChu(rs.getString("ghichu"));   
                entity.setSoLuong(rs.getInt("soluong"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<ChiTietHoaDon> selectByMaHD(String kw){
        String sql = "SELECT * FROM chitiethoadon WHERE mahd LIKE ? ";
        return this.selectBySql(sql, "%" + kw + "%");
    }
    
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJDBC.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Object[]> getTongTien(String mahd){
        String sql = "{Call tongtiencua1hoadon(?)}";
        String[] cols = {"tongtien"};
        return this.getListOfArray(sql, cols, mahd);
    }
}
