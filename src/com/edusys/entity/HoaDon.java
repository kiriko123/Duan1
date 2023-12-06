/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

import java.util.Date;

/**
 *
 * @author tankh
 */
public class HoaDon {
    private int maHD;
    private Date ngayXuat;
    private String maNV;
    private String maKH;
    private String ghiChu;
    private boolean isdelete;

    public HoaDon() {
    }

    @Override
    public String toString() {
        return "+maHD+";
    }

    
    
    

    public HoaDon(int maHD, Date ngayXuat, String maNV, String maKH, String ghiChu) {
        this.maHD = maHD;
        this.ngayXuat = ngayXuat;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ghiChu = ghiChu;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean isIsdelete() {
        return isdelete;
    }

    public void setIsdelete(boolean isdelete) {
        this.isdelete = isdelete;
    }
    
    
}
