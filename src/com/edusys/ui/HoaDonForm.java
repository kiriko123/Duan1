/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.edusys.ui;

import com.edusys.dao.HoaDonDAO;
import com.edusys.dao.KhachHangDAO;
import com.edusys.entity.ChiTietHoaDon;
import com.edusys.entity.HoaDon;
import com.edusys.entity.KhachHang;
import com.edusys.untis.Auth;
import com.edusys.untis.MsgBox;
import com.edusys.untis.XDate;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author tankh
 */
public class HoaDonForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form Maun
     */
    public HoaDonForm() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        init();

        this.customizeButton(btnChiTiet);
        this.customizeButton(btnMoi);
        this.customizeButton(btnSua);
        this.customizeButton(btnThem);
        this.customizeButton(btnXoa);

        customizeTextField(txtMaNV, new Color(255, 255, 255));
        customizeTextField(txtGhiChu, new Color(255, 255, 255));

        customizeTextField(txtMaHD, new Color(255, 255, 255));

        customizeTextField(txtTim, new Color(255, 255, 255));
        txtTim.setSize(64, 28);
        txtMaNV.setBackground(Color.gray);

        customizeComboBox(cboSapXep, new Color(63, 81, 181));
        customizeComboBox(cboMaKH, new Color(63, 81, 181));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboSapXep = new javax.swing.JComboBox<>();
        txtTim = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        btnChiTiet = new javax.swing.JButton();
        txtMaNV = new javax.swing.JTextField();
        dcsNgayXuat = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        cboMaKH = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(700, 510));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(159, 165, 213));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Search by:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quản lý hóa đơn ");

        cboSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lọc", "Mã nhân viên", " " }));
        cboSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSapXepActionPerformed(evt);
            }
        });

        txtTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTim)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cboSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 72, 114));
        jLabel9.setText("Mã hóa đơn ");

        txtMaHD.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtMaHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(1, 72, 114));
        jLabel10.setText("Ngày xuất ");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 72, 114));
        jLabel11.setText("Mã nhân viên");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 5, 3));

        btnThem.setBackground(new java.awt.Color(203, 186, 241));
        btnThem.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Graphicloads-100-Flat-Addition.24.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel5.add(btnThem);

        btnSua.setBackground(new java.awt.Color(203, 186, 241));
        btnSua.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Graphicloads-100-Flat-Pencil.24.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel5.add(btnSua);

        btnXoa.setBackground(new java.awt.Color(203, 186, 241));
        btnXoa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Graphicloads-100-Flat-Recyclebin.24.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel5.add(btnXoa);

        btnMoi.setBackground(new java.awt.Color(203, 186, 241));
        btnMoi.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Graphicloads-100-Flat-New.24.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel5.add(btnMoi);

        tblHoaDon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Ngày xuất", "Mã NV", "Mã KH", "Ghi chú"
            }
        ));
        tblHoaDon.setFocusable(false);
        tblHoaDon.setGridColor(new java.awt.Color(204, 204, 255));
        tblHoaDon.setRowHeight(25);
        tblHoaDon.setSelectionBackground(new java.awt.Color(255, 51, 102));
        tblHoaDon.getTableHeader().setReorderingAllowed(false);
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHoaDon);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 72, 114));
        jLabel12.setText("Ghi chú");

        txtGhiChu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtGhiChu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        btnChiTiet.setBackground(new java.awt.Color(255, 145, 144));
        btnChiTiet.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Graphicloads-100-Flat-Favourite-2.24.png"))); // NOI18N
        btnChiTiet.setText("Chi tiết hóa đơn");
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });

        txtMaNV.setEditable(false);
        txtMaNV.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        dcsNgayXuat.setBackground(new java.awt.Color(255, 255, 255));
        dcsNgayXuat.setDateFormatString("yyyy-MM-dd");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 72, 114));
        jLabel14.setText("Mã khách hàng");

        cboMaKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(194, 194, 194))
                                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(8, 8, 8)))
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dcsNgayXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel11))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtMaNV))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGhiChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(cboMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnChiTiet))
                                .addGap(30, 30, 30)))))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(3, 3, 3)
                        .addComponent(dcsNgayXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnChiTiet)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(txtMaHD.getText().length() > 9){
            MsgBox.alert(this, "Ma hoa don phai nho hon 9 ky tu");
            return;
        }
        try {
            Date ngaySinh = dcsNgayXuat.getDate();
            XDate.toString(ngaySinh, "dd-MM-yyy");
        } catch (Exception e) {
            MsgBox.alert(this, "Ngay xuat khong hop le");
            return;
        }
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(txtMaHD.getText().length() > 9){
            MsgBox.alert(this, "Ma hoa don phai nho hon 9 ky tu");
            return;
        }
        try {
            Date ngaySinh = dcsNgayXuat.getDate();
            XDate.toString(ngaySinh, "dd-MM-yyy");
        } catch (Exception e) {
            MsgBox.alert(this, "Ngay xuat khong hop le");
            return;
        }
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        // TODO add your handling code here:
        //if(evt.getClickCount() == 2){
        this.row = tblHoaDon.getSelectedRow();
        this.edit();
        //}
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void txtTimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKeyReleased
        // TODO add your handling code here:
        this.timKiem();
    }//GEN-LAST:event_txtTimKeyReleased

    private void cboSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSapXepActionPerformed
        // TODO add your handling code here:
        switch (cboSapXep.getSelectedIndex()) {

            case 1 -> {
                this.sapXepTheoMaNV();
                this.clearForm();
                this.row = -1;
                updateStatus();
            }
            default -> {
                this.fillTable();
                this.clearForm();
                this.row = -1;
                updateStatus();
            }
        }
    }//GEN-LAST:event_cboSapXepActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        // TODO add your handling code here:
        if (txtMaHD.getText().isBlank()) {
            MsgBox.alert(this, "Hoa don chua duoc chon");
            return;
        }
        HoaDon ct = dao.selectById(txtMaHD.getText());
        if (ct == null) {
            MsgBox.alert(this, "Hoa don chua duoc chon");
            return;
        }
        ChiTietHoaDonForm a = new ChiTietHoaDonForm(ct);
        a.setVisible(true);

    }//GEN-LAST:event_btnChiTietActionPerformed
    private void init() {

        tblHoaDon.getTableHeader().setDefaultRenderer(new HeaderColor());
        /*for (int i = 0; i < 2; i++) {
            tabs.setBackgroundAt(i, Color.DARK_GRAY);
            tabs.getComponentAt(i).setBackground(Color.DARK_GRAY);
            }*/
        this.fillTable();
        this.fillComboBoxKhachHang();
        //this.row = 0;
        //tblHoaDon.setRowSelectionInterval(this.row, this.row);
        this.updateStatus();
        txtMaNV.setText(Auth.user.getMaNV());
        //this.edit();
    }

    //disign table
    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            setFont(new Font("Segoe UI", Font.BOLD, 12));
            setBackground(new java.awt.Color(32, 136, 203));
            setForeground(new Color(255, 255, 255));
            //you can change the color that u want 
            return this;
        }
    }

    private void timKiem() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        updateStatus();
    }
    HoaDonDAO dao = new HoaDonDAO();
    int row = -1;

    // do data len table
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);

        try {
            String keyWord = txtTim.getText();
            List<HoaDon> list = dao.selectByKeyword(keyWord);
            //replaceAll(".", "*")
            for (HoaDon kh : list) {
                model.addRow(new Object[]{kh.getMaHD(), 
                    XDate.toString(XDate.addDays(kh.getNgayXuat(), 2), "yyyy-MM-dd"), 
                    kh.getMaNV(), kh.getMaKH(), kh.getGhiChu()});
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    KhachHangDAO khDao = new KhachHangDAO();

    private void fillComboBoxKhachHang() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaKH.getModel();
        model.removeAllElements();

        List<KhachHang> list = khDao.selectAll();

        for (KhachHang mh : list) {
            model.addElement(mh.getMaKH());
        }
    }

    private static void customizeComboBox(JComboBox comboBox, Color backgroundColor) {
        comboBox.setPreferredSize(new Dimension(79, 26));
        comboBox.setBackground(backgroundColor);
        comboBox.setForeground(Color.WHITE);

        // Tạo và áp dụng border cho JComboBox
        //Border customBorder = new LineBorder(Color.BLACK, 1, true); // Tạo border tùy chỉnh
        //comboBox.setBorder(customBorder);
        comboBox.setFont(new Font("Arial", Font.PLAIN, 14));

        // Hiệu ứng focus
        comboBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //comboBox.setBorder(new LineBorder(Color.BLUE)); // Đổi màu border khi focus
            }

            @Override
            public void focusLost(FocusEvent e) {
                //comboBox.setBorder(customBorder); // Trở lại màu border ban đầu khi không focus
            }
        });
    }

    void sapXepTheoMaNV() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);

        try {
            String keyWord = txtTim.getText();
            List<HoaDon> list = dao.selectByKeyword(keyWord);

            Collections.sort(list, (HoaDon nv1, HoaDon nv2) -> nv1.getMaNV().compareTo(nv2.getMaNV()));

            //replaceAll(".", "*")
            for (HoaDon kh : list) {
                model.addRow(new Object[]{kh.getMaHD(), kh.getNgayXuat(), kh.getMaNV(), kh.getMaKH(), kh.getGhiChu()});
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void setForm(HoaDon nv) {
        txtMaHD.setText(nv.getMaHD());
        txtMaNV.setText(nv.getMaNV());
        
        if (nv.getNgayXuat()!= null) {
            dcsNgayXuat.setDate(XDate.addDays(nv.getNgayXuat(), 2));
        } else {
            dcsNgayXuat.setDate(nv.getNgayXuat());
        }
        
        txtGhiChu.setText(nv.getGhiChu());

        if (cboMaKH.getItemCount() > 0 && nv.getMaKH() != null) {
            for (int i = 0; i < cboMaKH.getItemCount(); i++) {
                String maKH = cboMaKH.getItemAt(i);
                if (nv.getMaKH().equals(maKH)) {
                    cboMaKH.setSelectedIndex(i);
                    break;
                }

            }
        }

    }

    HoaDon getForm() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Get the current date
        java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());

        // Extract and format the date from the chooser
        Date ngayXuat = dcsNgayXuat.getDate();
        java.sql.Date sqlNgayXuat = null;

        if (ngayXuat != null) {
            String formattedXuat = dateFormat.format(ngayXuat);

            try {
                sqlNgayXuat = java.sql.Date.valueOf(formattedXuat);
            } catch (IllegalArgumentException e) {

            }
        }

        HoaDon nv = new HoaDon();
        nv.setMaKH((String) cboMaKH.getSelectedItem());
        nv.setGhiChu(txtGhiChu.getText());
        nv.setNgayXuat(sqlNgayXuat);
        nv.setMaNV(txtMaNV.getText());
        nv.setMaHD(txtMaHD.getText());

        return nv;
    }

    void clearForm() {
        HoaDon nv = new HoaDon();
        nv.setMaNV(Auth.user.getMaNV());

        this.setForm(nv);

        this.row = -1;
        this.updateStatus();

    }

    void edit() {
        String manv = (String) tblHoaDon.getValueAt(this.row, 0);
        HoaDon nv = dao.selectById(manv);
        this.setForm(nv);

        this.updateStatus();
    }

    void insert() {
        KhachHang kh = khDao.selectById((String) cboMaKH.getSelectedItem());
        if (kh.isIsdelete() == true) {
            MsgBox.alert(this, "Khách hàng đã bị xóa nên không thể thêm được");
            return;
        }
        if (!this.isValided()) {
            MsgBox.alert(this, "Vui long dien day du du lieu");
            return;
        }
        List<HoaDon> listHD = dao.selectAll();
        
        HoaDon nh = getForm();
        
        for (HoaDon hoaDon : listHD) {
            if(hoaDon.getMaHD().equals(nh.getMaHD())){
                MsgBox.alert(this, "Hoa don da co");
                return;
            }
        }
        try {
            dao.insert(nh);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    void update() {
        HoaDon nh = getForm();
        try {
            dao.update(nh);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại");
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa hóa đơn ");
        } else {
            String mahd = txtMaHD.getText();

            if (MsgBox.comfirm(this, "Bạn muốn xóa hóa đơn này chứ ? ")) {
                try {
                    HoaDon hd = dao.selectById(mahd);
                    hd.setIsdelete(true);
                    dao.update(hd);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công ");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại ");
                }
            }
        }
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void next() {
        if (this.row < tblHoaDon.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void last() {
        this.row = tblHoaDon.getRowCount() - 1;
        this.edit();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblHoaDon.getRowCount() - 1);

        // trang thai form
        txtMaHD.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        //thanh dieu huong
        
    }

    private static void customizeButton(JButton button) {
        button.setPreferredSize(new Dimension(88, 31));
        button.setBackground(new Color(0, 150, 136));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Xử lý khi click vào button
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // Xử lý khi nhấn chuột
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Xử lý khi thả chuột
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(244, 67, 54));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(0, 150, 136));
            }
        });
    }

    private static void customizeTextField(JTextField textField, Color backgroundColor) {
        textField.setPreferredSize(new Dimension(55, 20));
        textField.setBackground(backgroundColor);
        textField.setForeground(Color.BLACK);

        // Border
        Border line = new LineBorder(Color.BLACK); // Đường viền đen
        Border margin = new EmptyBorder(0, 10, 0, 10); // Khoảng trống giữa viền và văn bản
        Border compound = new CompoundBorder(line, margin); // Kết hợp đường viền và khoảng trống
        textField.setBorder(compound);

        // Để làm cho text hiển thị tốt hơn trên nền màu
        textField.setCaretColor(Color.BLACK); // Màu con trỏ (caret) là màu đen
        textField.setSelectionColor(Color.GRAY); // Màu khi chọn văn bản là màu xám

        textField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Hiệu ứng focus
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField.setBorder(new LineBorder(Color.BLUE)); // Đổi màu border khi focus
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField.setBorder(compound); // Trở lại màu border ban đầu khi không focus
            }
        });
    }

    boolean isValided() {
        if (txtMaHD.getText().isBlank() || txtMaNV.getText().isBlank() || dcsNgayXuat.getDate() == null) {
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboMaKH;
    private javax.swing.JComboBox<String> cboSapXep;
    private com.toedter.calendar.JDateChooser dcsNgayXuat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
