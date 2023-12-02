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
public class SanPham {
    private String maSP;
    private String tenSP;
    private boolean tinhTrang;
    private Date ngayNhapHang;
    private String ghiChu;
    private double giaTien;
    private String maNV;
    private String maMH;
    private String hinh;
    
    private boolean isdelete;

    public SanPham(String maSP, String tenSP, boolean tinhTrang, Date ngayNhapHang, String ghiChu, double giaTien, String maNV, String maMH, String hinh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tinhTrang = tinhTrang;
        this.ngayNhapHang = ngayNhapHang;
        this.ghiChu = ghiChu;
        this.giaTien = giaTien;
        this.maNV = maNV;
        this.maMH = maMH;
        this.hinh = hinh;
    }

    public SanPham() {
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Date getNgayNhapHang() {
        return ngayNhapHang;
    }

    public void setNgayNhapHang(Date ngayNhapHang) {
        this.ngayNhapHang = ngayNhapHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public boolean isIsdelete() {
        return isdelete;
    }

    public void setIsdelete(boolean isdelete) {
        this.isdelete = isdelete;
    }
    
    

    @Override
    public String toString() {
        return maSP;
    }
    
    
}
