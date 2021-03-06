/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import helper.SharedData;
import model.NhanVien;

/**
 *
 * @author nhokk
 */
public class NhanVienMainForm extends javax.swing.JFrame {

    /**
     * Creates new form HocVien_TrangChu
     */
    private NhanVien nv;
    private NhanVien_KhachHang nvKhachHang;
    private NhanVien_SanPham nvSanPham;
    private NhanVien_HoaDon nvHoaDon;
    private ThongTinNhanVien nvThongTin;
    
    public NhanVienMainForm() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        btnQLSP = new javax.swing.JButton();
        btnQLKH = new javax.swing.JButton();
        btnQLHD = new javax.swing.JButton();
        btnQLDH = new javax.swing.JButton();
        nvMainTab = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 100));

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-icon-32.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setBorder(null);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnQLSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-help-about-icon-32.png"))); // NOI18N
        btnQLSP.setText("Quản lý sản phẩm");
        btnQLSP.setBorder(null);
        btnQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSPActionPerformed(evt);
            }
        });

        btnQLKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Person-Male-Light-icon-24.png"))); // NOI18N
        btnQLKH.setText("Quản lý khách hàng");
        btnQLKH.setBorder(null);
        btnQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKHActionPerformed(evt);
            }
        });

        btnQLHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-help-about-icon-32.png"))); // NOI18N
        btnQLHD.setText("Quản lý hóa đơn");
        btnQLHD.setBorder(null);
        btnQLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHDActionPerformed(evt);
            }
        });

        btnQLDH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-help-about-icon-32.png"))); // NOI18N
        btnQLDH.setText("Thông tin nhân viên");
        btnQLDH.setBorder(null);
        btnQLDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLDH, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLDH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nvMainTab.setBackground(new java.awt.Color(255, 255, 255));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 20));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(nvMainTab, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nvMainTab, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSPActionPerformed
        if (nvSanPham == null) {
            nvSanPham = new NhanVien_SanPham();
            nvMainTab.add(nvSanPham);
        }
        if (nvKhachHang != null) nvKhachHang.setVisible(false);
        if (nvHoaDon != null) nvHoaDon.setVisible(false);
        nvSanPham.setVisible(true);
    }//GEN-LAST:event_btnQLSPActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        DangNhapDialog dn = new DangNhapDialog(this, true);
        setVisible(false);
        dn.setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKHActionPerformed
                if (nvKhachHang == null) {
            
            nvKhachHang = new NhanVien_KhachHang();
            nvMainTab.add(nvKhachHang);
        }
        if (nvSanPham != null) nvSanPham.setVisible(false);
        if (nvHoaDon != null) nvHoaDon.setVisible(false);
        nvKhachHang.setVisible(true);
    }//GEN-LAST:event_btnQLKHActionPerformed
    
    private void btnQLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHDActionPerformed
        if (nvHoaDon == null) {
            nvHoaDon = new NhanVien_HoaDon();
            nvMainTab.add(nvHoaDon);
        }
        if (nvSanPham != null) nvSanPham.setVisible(false);
        if (nvKhachHang != null) nvKhachHang.setVisible(false);     
        nvHoaDon.setVisible(true);
    }//GEN-LAST:event_btnQLHDActionPerformed

    private void btnQLDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDHActionPerformed
        nv = SharedData.nguoiDangNhapNV;
        nvThongTin = new ThongTinNhanVien(nv);
        nvThongTin.setVisible(true);
        nvThongTin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnQLDHActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnQLDH;
    private javax.swing.JButton btnQLHD;
    private javax.swing.JButton btnQLKH;
    private javax.swing.JButton btnQLSP;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel nvMainTab;
    // End of variables declaration//GEN-END:variables
}
