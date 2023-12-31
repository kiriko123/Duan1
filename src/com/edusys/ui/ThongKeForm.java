/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.edusys.ui;

import com.edusys.dao.HoaDonDAO;
import com.edusys.dao.MatHangDAO;
import com.edusys.dao.SanPhamDAO;
import com.edusys.dao.SanPhamDAO;
import com.edusys.dao.ThongKeDAO;
import com.edusys.entity.MatHang;
import com.edusys.entity.SanPham;
import com.edusys.entity.SanPham;
import com.edusys.untis.Auth;
import com.edusys.untis.MsgBox;
import com.edusys.untis.XDate;
import com.edusys.untis.XImage;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
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
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
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
public class ThongKeForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form Maun
     */
    public ThongKeForm() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        customizeComboBox(cboNam, new Color(63, 81, 181));
        init();

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKH2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblKH1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cboNam = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSP1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSP2 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(700, 510));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(159, 165, 213));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thống kê");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tabs.setBackground(new java.awt.Color(255, 255, 255));
        tabs.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblDoanhThu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Năm", "Doanh thu"
            }
        ));
        tblDoanhThu.setRowHeight(25);
        tblDoanhThu.setSelectionBackground(new java.awt.Color(255, 153, 204));
        tblDoanhThu.getTableHeader().setReorderingAllowed(false);
        tblDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoanhThuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDoanhThu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        tabs.addTab("Doanh thu", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblKH2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tblKH2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaKH", "TenKh", "Email"
            }
        ));
        tblKH2.setRowHeight(25);
        tblKH2.setSelectionBackground(new java.awt.Color(255, 153, 204));
        tblKH2.getTableHeader().setReorderingAllowed(false);
        tblKH2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKH2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblKH2);

        tblKH1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tblKH1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaKH", "TenKH", "Email", "SL HD"
            }
        ));
        tblKH1.setRowHeight(25);
        tblKH1.setSelectionBackground(new java.awt.Color(255, 153, 204));
        tblKH1.getTableHeader().setReorderingAllowed(false);
        tblKH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKH1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblKH1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Top 3 khách hàng mua nhiều nhất");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Khách hàng chưa có hóa đơn");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );

        tabs.addTab("Khách hàng", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Top 3  sản phẩm bán nhiều nhất theo năm");

        tblSP1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tblSP1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nam", "MaSP", "TenSP", "SL HD"
            }
        ));
        tblSP1.setRowHeight(25);
        tblSP1.setSelectionBackground(new java.awt.Color(255, 153, 204));
        tblSP1.getTableHeader().setReorderingAllowed(false);
        tblSP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSP1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblSP1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Sản phẩm chưa bán được");

        tblSP2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tblSP2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaSP", "TenSP"
            }
        ));
        tblSP2.setRowHeight(25);
        tblSP2.setSelectionBackground(new java.awt.Color(255, 153, 204));
        tblSP2.getTableHeader().setReorderingAllowed(false);
        tblSP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSP2MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblSP2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboNam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tabs.addTab("Sản phẩm", jPanel4);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tabs)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
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

    private void tblDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoanhThuMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblDoanhThuMouseClicked

    private void tblKH2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKH2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblKH2MouseClicked

    private void tblKH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKH1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblKH1MouseClicked

    private void tblSP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSP1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSP1MouseClicked

    private void tblSP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSP2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSP2MouseClicked

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
        if(cboNam.getSelectedItem()!= null){
            this.fillTableSP1();
        }
    }//GEN-LAST:event_cboNamActionPerformed
    ThongKeDAO tkDao = new ThongKeDAO();


    private void init() {

        tblDoanhThu.getTableHeader().setDefaultRenderer(new ThongKeForm.HeaderColor());
        tblKH1.getTableHeader().setDefaultRenderer(new ThongKeForm.HeaderColor());
        tblKH2.getTableHeader().setDefaultRenderer(new ThongKeForm.HeaderColor());
        tblSP1.getTableHeader().setDefaultRenderer(new ThongKeForm.HeaderColor());
        tblSP2.getTableHeader().setDefaultRenderer(new ThongKeForm.HeaderColor());
        this.fillTableDoanhThu();
        this.fillTableKhachHang1();
        this.fillTableKhachHang2();
        this.fillComboBoxNam();
        this.fillTableSP2();
    }
    
    private void fillTableDoanhThu() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);

        List<Object[]> list = tkDao.getDoanhThu();
        for (Object[] objects : list) {
            double doanhthu = (double) objects[1];
            model.addRow(new Object[]{objects[0], doanhthu+"  VND"});
        }
    }
    
    private void fillTableKhachHang1() {
        DefaultTableModel model = (DefaultTableModel) tblKH1.getModel();
        model.setRowCount(0);

        List<Object[]> list = tkDao.getKhachHangMuaNhieuNhatTheoHoaDon();
        list =  list.stream().limit(3).collect(Collectors.toList());
        for (Object[] objects : list) {
            
            model.addRow(new Object[]{objects[0], objects[1], objects[2], objects[3]});
        }
    }
    private void fillTableKhachHang2() {
        DefaultTableModel model = (DefaultTableModel) tblKH2.getModel();
        model.setRowCount(0);

        List<Object[]> list = tkDao.getKhachHangChuaMuaHang();

        for (Object[] objects : list) {
            
            model.addRow(new Object[]{objects[0], objects[1], objects[2]});
        }
    }
    HoaDonDAO hdDao = new HoaDonDAO();
    private void fillComboBoxNam() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();
        
        List<Integer> list = hdDao.selectYears();
        
        for (Integer integer : list) {
            model.addElement(integer);
        }
    }
    
    private void fillTableSP1() {
        DefaultTableModel model = (DefaultTableModel) tblSP1.getModel();
        model.setRowCount(0);
        
        int nam = (Integer) cboNam.getSelectedItem();
        
        List<Object[]> list = tkDao.getSanPhamBanNhieuNhatTheoNam(nam);
        list = list.stream().limit(3).collect(Collectors.toList());
        
        for (Object[] objects : list) {
            model.addRow(objects);
        }
    }
    
    private void fillTableSP2() {
        DefaultTableModel model = (DefaultTableModel) tblSP2.getModel();
        model.setRowCount(0);
        
 
        
        List<Object[]> list = tkDao.getSanPhamChuaCoAiMua();

        
        for (Object[] objects : list) {
            model.addRow(new Object[]{objects[0], objects[1]});
        }
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
        textField.setPreferredSize(new Dimension(70, 20));
        textField.setBackground(backgroundColor);
        textField.setForeground(Color.BLACK);

        // Border
        Border line = new LineBorder(Color.BLACK); // Đường viền đen
        Border margin = new EmptyBorder(0, 10, 0, 10); // Khoảng trống giữa viền và văn bản
        Border compound = new CompoundBorder(line, margin); // Kết hợp đường viền và khoảng trống
        textField.setBorder(compound);


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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblKH1;
    private javax.swing.JTable tblKH2;
    private javax.swing.JTable tblSP1;
    private javax.swing.JTable tblSP2;
    // End of variables declaration//GEN-END:variables
}
