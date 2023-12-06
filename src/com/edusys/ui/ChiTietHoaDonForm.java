/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.edusys.ui;

import com.edusys.dao.ChiTietHoaDonDAO;
import com.edusys.dao.HoaDonDAO;
import com.edusys.dao.KhachHangDAO;
import com.edusys.dao.NhanVienDAO;
import com.edusys.dao.SanPhamDAO;
import com.edusys.entity.ChiTietHoaDon;
import com.edusys.entity.HoaDon;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.edusys.entity.KhachHang;
import com.edusys.entity.NhanVien;
import com.edusys.entity.SanPham;
import com.edusys.untis.Auth;
import com.edusys.untis.ImageConverter;
import com.edusys.untis.MsgBox;
import com.edusys.untis.XDate;
import com.edusys.untis.XImage;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.HeadlessException;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author tankh
 */
public final class ChiTietHoaDonForm extends javax.swing.JDialog {

    /**
     * Creates new form AnhNhanVienJDialog
     */
    private HoaDon hd;

    public ChiTietHoaDonForm(java.awt.Frame parent, boolean modal) {

        super(parent, modal);

    }

    public ChiTietHoaDonForm() {

    }

    public ChiTietHoaDonForm(HoaDon hd) {

        this.hd = hd;
        initComponents();
        setLocationRelativeTo(null);
        if (this.hd == null) {
            MsgBox.alert(this, "Không có hoa don được chọn");
        } else {

        }
        this.setTitle("Chi tiết của " + this.hd.getMaHD());

        this.customizeButton(btnMoi);
        this.customizeButton(btnSua);
        this.customizeButton(btnThem);
        this.customizeButton(btnXoa);

        customizeTextField(txtMaHD, new Color(255, 255, 255));

        customizeTextField(txtDiaChi, new Color(255, 255, 255));
        customizeTextField(txtNgayXuat, new Color(255, 255, 255));
        customizeTextField(txtGhiChu, new Color(255, 255, 255));
        customizeTextField(txtEmail, new Color(255, 255, 255));
        customizeTextField(txtSoLuong, new Color(255, 255, 255));
        customizeTextField(txtTenKhachHang, new Color(255, 255, 255));
        customizeTextField(txtTenNV, new Color(255, 255, 255));
        customizeComboBox(cboMaSP, new Color(63, 81, 181));
        init();

    }

    public HoaDon getHd() {
        return hd;
    }

    public void setHd(HoaDon hd) {
        this.hd = hd;
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        PNHoaDon = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNgayXuat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTietHoaDon = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        cboMaSP = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnChiTiet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(232, 245, 200));
        kGradientPanel1.setkStartColor(new java.awt.Color(159, 165, 213));

        PNHoaDon.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 72, 114));
        jLabel9.setText("Ma hoa don");

        txtMaHD.setEditable(false);
        txtMaHD.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtMaHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 72, 114));
        jLabel5.setText("Ten khach hang");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 72, 114));
        jLabel7.setText("Ten nhan vien");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(1, 72, 114));
        jLabel10.setText("Ngay xuat");

        txtNgayXuat.setEditable(false);
        txtNgayXuat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtNgayXuat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 72, 114));
        jLabel11.setText("Dia chi khach hang");

        txtDiaChi.setEditable(false);
        txtDiaChi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 72, 114));
        jLabel13.setText("Email");

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Hoa Don");

        tblChiTietHoaDon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tblChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaSP", "TenSP", "SL", "Gia", "TT"
            }
        ));
        tblChiTietHoaDon.setFocusable(false);
        tblChiTietHoaDon.setGridColor(new java.awt.Color(204, 204, 255));
        tblChiTietHoaDon.setRowHeight(25);
        tblChiTietHoaDon.setSelectionBackground(new java.awt.Color(255, 51, 102));
        tblChiTietHoaDon.getTableHeader().setReorderingAllowed(false);
        tblChiTietHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChiTietHoaDon);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 72, 114));
        jLabel6.setText("Chi tiet");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Tong tien");

        lblTongTien.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblTongTien.setText("000000");

        txtTenKhachHang.setEditable(false);
        txtTenKhachHang.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTenKhachHang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        txtTenNV.setEditable(false);
        txtTenNV.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtTenNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        jLabel2.setText("VND");

        javax.swing.GroupLayout PNHoaDonLayout = new javax.swing.GroupLayout(PNHoaDon);
        PNHoaDon.setLayout(PNHoaDonLayout);
        PNHoaDonLayout.setHorizontalGroup(
            PNHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNHoaDonLayout.createSequentialGroup()
                        .addGroup(PNHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PNHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel13)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(txtMaHD)
                                .addComponent(txtNgayXuat)
                                .addComponent(txtDiaChi)
                                .addComponent(txtEmail))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTenKhachHang)
                    .addComponent(txtTenNV)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNHoaDonLayout.createSequentialGroup()
                        .addGap(0, 97, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        PNHoaDonLayout.setVerticalGroup(
            PNHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(2, 2, 2)
                .addComponent(txtNgayXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTongTien)
                    .addComponent(jLabel2))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PNHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(PNHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(1, 72, 114));
        jLabel32.setText("Mã sản phẩm");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(1, 72, 114));
        jLabel33.setText("Số lượng");

        txtSoLuong.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtSoLuong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(1, 72, 114));
        jLabel34.setText("Ghi chú");

        txtGhiChu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtGhiChu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(203, 186, 241)));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.GridLayout(1, 0, 5, 3));

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
        jPanel15.add(btnThem);

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
        jPanel15.add(btnSua);

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
        jPanel15.add(btnXoa);

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
        jPanel15.add(btnMoi);

        cboMaSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Chi tiết hóa đơn");

        btnChiTiet.setBackground(new java.awt.Color(255, 145, 144));
        btnChiTiet.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/Graphicloads-100-Flat-Favourite-2.24.png"))); // NOI18N
        btnChiTiet.setText("Xuất");
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtGhiChu, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboMaSP, javax.swing.GroupLayout.Alignment.LEADING, 0, 315, Short.MAX_VALUE))
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChiTiet)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addGap(7, 7, 7)
                .addComponent(cboMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnChiTiet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblChiTietHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietHoaDonMouseClicked
        // TODO add your handling code here:
        //if(evt.getClickCount() == 2){
        this.row = tblChiTietHoaDon.getSelectedRow();
        //this.edit();
        //}
        this.edit();
    }//GEN-LAST:event_tblChiTietHoaDonMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(!this.isValided()){
            MsgBox.alert(this, "Vui long nhap day du du lieu");
            return;
        }
        try {
            int sl = Integer.parseInt(txtSoLuong.getText());
            if(sl < 0){
                MsgBox.alert(this, "So luong phai lon hon 0");
                return;
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Vui long nhap dung so luong");
            return;
        }
        List<ChiTietHoaDon> ct = dao.selectByMaHD(hd.getMaHD());
        boolean check = false;
        
        for (ChiTietHoaDon chiTietHoaDon : ct) {
            if (chiTietHoaDon.getMaSP().equals(cboMaSP.getSelectedItem())) {
                
                MsgBox.alert(this, "San pham da ton tai vui long them moi");
                /*this.update();
                
                
                List<Object[]> list = dao.getTongTien(hd.getMaHD());
                if (!list.isEmpty() && list.get(0)[0] != null) {
                double tongtien = (double) list.get(0)[0];
                lblTongTien.setText(String.format("%.2f", tongtien));
                }*/
                check = true;
                break;
            }
        }
        if (check == false) {
            this.insert();
            List<Object[]> list = dao.getTongTien(hd.getMaHD());
            if (!list.isEmpty() && list.get(0)[0] != null) {
                double tongtien = (double) list.get(0)[0];
                lblTongTien.setText(String.format("%.2f", tongtien));
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
        
        List<Object[]> list = dao.getTongTien(hd.getMaHD());
        if (!list.isEmpty() && list.get(0)[0] != null) {
            double tongtien = (double) list.get(0)[0];
            lblTongTien.setText(String.format("%.2f", tongtien));
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
        List<Object[]> list = dao.getTongTien(hd.getMaHD());
        if (!list.isEmpty() && list.get(0)[0] != null) {
            double tongtien = (double) list.get(0)[0];
            lblTongTien.setText(String.format("%.2f", tongtien));
        } else{
            lblTongTien.setText("0");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        Document document = new Document(new Rectangle(PNHoaDon.getWidth(), PNHoaDon.getHeight()));
        try {
            JFileChooser jfc = new JFileChooser();
            int rs = jfc.showSaveDialog(null);
            if (rs == JFileChooser.APPROVE_OPTION) {
                // Lấy đường dẫn đã chọn
                File selectedFile = jfc.getSelectedFile();
                String selectedFilePath = selectedFile.getAbsolutePath();

                // Tạo tài liệu PDF và lưu vào đường dẫn đã chọn
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(selectedFilePath));
                document.open();

                // Tạo một đối tượng Graphics2D để vẽ JPanel vào tài liệu PDF
                Graphics2D g2d = writer.getDirectContent().createGraphics(PNHoaDon.getWidth(), PNHoaDon.getHeight());
                PNHoaDon.print(g2d);

                // Kết thúc việc vẽ và đóng tài liệu PDF
                g2d.dispose();
                document.close();
                writer.close();
                System.out.println("PDF created successfully!");
                MsgBox.alert(this, "Xuat thanh cong");
            } else {
                // Người dùng đã hủy hoặc đóng cửa sổ dialog
                System.out.println("Hủy hoặc đóng dialog");
            }
        } catch (DocumentException | java.io.IOException e) {
            e.printStackTrace();
        }
    
        
        
    
    }//GEN-LAST:event_btnChiTietActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChiTietHoaDonForm dialog = new ChiTietHoaDonForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void init() {

        tblChiTietHoaDon.getTableHeader().setDefaultRenderer(new HeaderColor());
        /*for (int i = 0; i < 2; i++) {
            tabs.setBackgroundAt(i, Color.DARK_GRAY);
            tabs.getComponentAt(i).setBackground(Color.DARK_GRAY);
            }*/
        this.fillTable();
        this.fillComboBoxSanPham();

        this.updateStatus();
        
        List<Object[]> list = dao.getTongTien(hd.getMaHD());
        if (!list.isEmpty() && list.get(0)[0] != null) {
            double tongtien = (double) list.get(0)[0];
            lblTongTien.setText(String.format("%.2f", tongtien));
        }
        txtMaHD.setText(hd.getMaHD());

        NhanVienDAO nvdao = new NhanVienDAO();

        NhanVien nv = nvdao.selectById(hd.getMaNV());

        txtTenNV.setText(nv.getHoTen());

        KhachHangDAO khdao = new KhachHangDAO();

        KhachHang kh = khdao.selectById(hd.getMaKH());
        txtTenKhachHang.setText(kh.getTenKH());
        txtDiaChi.setText(kh.getDiaChi());
        txtEmail.setText(kh.getEmail());

        txtNgayXuat.setText(XDate.toString(XDate.addDays(hd.getNgayXuat(), 2),"yyyy-MM-dd"));
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

    ChiTietHoaDonDAO dao = new ChiTietHoaDonDAO();
    int row = -1;
    HoaDonDAO hdDao = new HoaDonDAO();
    // do data len table
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietHoaDon.getModel();
        model.setRowCount(0);

        try {

            List<ChiTietHoaDon> list = dao.selectByMaHD(this.hd.getMaHD());

            for (ChiTietHoaDon ct : list) {
                //HoaDon hd = hdDao.selectById(ct.getMaHD());
                SanPham sp = spDao.selectById(ct.getMaSP());
                Double thanhTien = ct.getSoLuong() * sp.getGiaTien();
                model.addRow(new Object[]{ct.getMaSP(), sp.getTenSP(), ct.getSoLuong(), sp.getGiaTien(), thanhTien});
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    SanPhamDAO spDao = new SanPhamDAO();

    private void fillComboBoxSanPham() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaSP.getModel();
        model.removeAllElements();

        List<SanPham> list = spDao.selectAll();
        /* list = list.stream()
        .filter(sanPham -> sanPham.isTinhTrang()) // Điều kiện lọc: tinhTrang = true
        .collect(Collectors.toList());*/
        for (SanPham mh : list) {
            model.addElement(mh.getMaSP());
        }
    }

    void setForm(ChiTietHoaDon nv) {

        txtSoLuong.setText(String.valueOf(nv.getSoLuong()));
        txtGhiChu.setText(nv.getGhiChu());

        if (cboMaSP.getItemCount() > 0 && nv.getMaSP() != null) {
            for (int i = 0; i < cboMaSP.getItemCount(); i++) {
                String maSP = cboMaSP.getItemAt(i);
                if (nv.getMaSP().equals(maSP)) {
                    cboMaSP.setSelectedIndex(i);
                    break;
                }

            }
        }

    }

    ChiTietHoaDon getForm() {

        ChiTietHoaDon nv = new ChiTietHoaDon();

        nv.setGhiChu(txtGhiChu.getText());

        nv.setMaHD(hd.getMaHD());

        nv.setSoLuong(Integer.parseInt(txtSoLuong.getText()));

        nv.setMaSP((String) cboMaSP.getSelectedItem());

        return nv;
    }

    void clearForm() {
        ChiTietHoaDon nv = new ChiTietHoaDon();

        this.setForm(nv);

        this.row = -1;
        this.updateStatus();

    }

    void edit() {
        String manv = (String) tblChiTietHoaDon.getValueAt(this.row, 0);
        ChiTietHoaDon nv = dao.selectById(manv);
        this.setForm(nv);

        this.updateStatus();
    }

    void insert() {
        
        ChiTietHoaDon nh = getForm();
        SanPham sp = spDao.selectById(nh.getMaSP());
        if(sp.isIsdelete() == true){
            MsgBox.alert(this, "San pham da bi xoa");
            return;
        }
        if(sp.isTinhTrang() == false){
            MsgBox.alert(this, "San pham da het");
            return;
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
        List<ChiTietHoaDon> listCT = dao.selectByMaHD(txtMaHD.getText());
        
        ChiTietHoaDon nh = getForm();
        
        boolean check = false;
        for (ChiTietHoaDon chiTietHoaDon : listCT) {
            if(chiTietHoaDon.getMaSP().equals(nh.getMaSP())){
                check = true;
                break;
            }
        }
        if(check == false){
            MsgBox.alert(this, "Chi tiet khong ton tai");
            return;
        }
        try {
            dao.update(nh);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Cập nhật thất bại");
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa chi tiet");
        } else {
            String masp = (String) cboMaSP.getSelectedItem();
            if (MsgBox.comfirm(this, "Bạn muốn xóa SP này chứ ? ")) {
                try {
                    dao.delete(masp);
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
        if (this.row < tblChiTietHoaDon.getRowCount() - 1) {
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
        this.row = tblChiTietHoaDon.getRowCount() - 1;
        this.edit();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblChiTietHoaDon.getRowCount() - 1);

        // trang thai form
        //txtMaHD.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        //thanh dieu huong
    }

    private static void customizeButton(JButton button) {
        button.setPreferredSize(new Dimension(180, 31));
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
        textField.setPreferredSize(new Dimension(61, 20));
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
    boolean isValided(){
        if(txtSoLuong.getText().isBlank()){
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PNHoaDon;
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboMaSP;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JTable tblChiTietHoaDon;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgayXuat;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
