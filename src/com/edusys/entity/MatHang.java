/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

/**
 *
 * @author tankh
 */
public class MatHang {
    private String mamh;
    private String tenmh;
    private String xuatXu;
    private String moTa;
    private String hinh;
    private String ghiChu;
    private boolean isdelete;

    public MatHang() {
    }

    public MatHang(String mamh, String tenmh, String xuatXu, String moTa, String hinh, String ghiChu) {
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.xuatXu = xuatXu;
        this.moTa = moTa;
        this.hinh = hinh;
        this.ghiChu = ghiChu;
    }

    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
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
    
    

    @Override
    public String toString() {
        return  mamh;
    }
    
    
}
