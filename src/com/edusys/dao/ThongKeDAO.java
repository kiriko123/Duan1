/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.untis.XJDBC;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author tankh
 */
public class ThongKeDAO {
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
    
    public List<Object[]> getDoanhThu(){
        String sql = "{Call sp_TinhTongTienTheoNam}";
        String[] cols = {"Nam", "TongTien"};
        return this.getListOfArray(sql, cols);
    }
    public List<Object[]> getKhachHangMuaNhieuNhatTheoHoaDon(){
        String sql = "{Call sp_ThongKeKhachHangMuaNhieuNhatTheoHoaDon}";
        String[] cols = {"MaKH", "TenKH", "Email", "SoLuongHoaDon"};
        return this.getListOfArray(sql, cols);
    }
    public List<Object[]> getKhachHangChuaMuaHang(){
        String sql = "{Call sp_ThongKeKhachHangChuaMuaHang}";
        String[] cols = {"MaKH", "TenKH", "Email"};
        return this.getListOfArray(sql, cols);
    }
    public List<Object[]> getSanPhamBanNhieuNhatTheoNam(int nam){
        String sql = "{Call sp_ThongKeSanPhamBanNhieuNhatTheoNam(?)}";
        String[] cols = {"Nam", "MaSP", "TenSP", "SoLuongBan"};
        return this.getListOfArray(sql, cols, nam);
    }
    
    public List<Object[]> getSanPhamChuaCoAiMua(){
        String sql = "{Call sp_ThongKeSanPhamChuaCoAiMua}";
        String[] cols = {"MaSP", "TenSP", "TinhTrang", "GhiChu"};
        return this.getListOfArray(sql, cols);
    }
}
