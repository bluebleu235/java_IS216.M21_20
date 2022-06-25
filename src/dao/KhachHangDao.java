/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.KhachHang;
import helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhokk
 */
public class KhachHangDao {

    public List<KhachHang> findAll()
            throws Exception {
        String sql = "select taikhoanKH, ten, gioitinh, ngaysinh, diachi, email, sdt FROM KHACHHANG";
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            //pstmt.setString(1, taikhoanKH);

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<KhachHang> list = new ArrayList<>();
                while (rs.next()) {
                    KhachHang kh = createKhachHang(rs);
                    list.add(kh);
                }
                return list;
            }
        }
    }

    public KhachHang findById(String taikhoanKH)
            throws Exception {
        String sql = "select taikhoanKH, ten, gioitinh, ngaysinh, diachi, email, sdt FROM KHACHHANG Where taikhoanKH = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, taikhoanKH);

            try ( ResultSet rs = pstmt.executeQuery();) {
                KhachHang kh = new KhachHang();
                if (rs.next()) {
                    kh = createKhachHang(rs);
                }
                return kh;
            }
        }
    }

    public List<KhachHang> findByTenKH(String tenKH)
            throws Exception {
        String sql = "select * FROM KHACHHANG WHERE TEN LIKE '%" + tenKH + "%'";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<KhachHang> list = new ArrayList<>();
                while (rs.next()) {
                    KhachHang kh = createKhachHang(rs);
                    list.add(kh);
                }
                return list;
            }
        }
    }

    public List<KhachHang> findByMaKH(String MaKh)
            throws Exception {
        String sql = "select * FROM KHACHHANG WHERE taikhoanKH LIKE '%" + MaKh + "%'";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<KhachHang> list = new ArrayList<>();
                while (rs.next()) {
                    KhachHang kh = createKhachHang(rs);
                    list.add(kh);
                }
                return list;
            }
        }
    }

    public boolean Insert(KhachHang kh)
            throws Exception {
        String sql = "INSERT INTO KhachHang VALUES (?,?,?,?,?,?,?)";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, kh.getTaiKhoanKH());
            pstmt.setString(2, kh.getTen());
            pstmt.setString(3, kh.getNgaySinh());
            pstmt.setString(4, kh.getGioiTinh());
            pstmt.setString(5, kh.getSdt());
            pstmt.setString(6, kh.getEmail());
            pstmt.setString(7, kh.getDiaChi());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean Update(KhachHang kh)
            throws Exception {
        String sql = "Update KhachHang set Ten = ?, NgaySinh = ?, GioiTinh = ?, sdt = ?, email = ?, diachi = ? where TaikhoanKH = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, kh.getTen());
            pstmt.setString(2, kh.getNgaySinh());
            pstmt.setString(3, kh.getGioiTinh());
            pstmt.setString(4, kh.getSdt());
            pstmt.setString(5, kh.getEmail());
            pstmt.setString(6, kh.getDiaChi());
            pstmt.setString(7, kh.getTaiKhoanKH());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean Delete(KhachHang kh)
            throws Exception {
        String sql = "Delete From KhachHang Where taikhoanKH = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, kh.getTaiKhoanKH());
            return pstmt.executeUpdate() > 0;
        }
    }

    private KhachHang createKhachHang(final ResultSet rs) throws SQLException {
        KhachHang kh = new KhachHang();
        kh.setTaiKhoanKH(rs.getString("taikhoanKH"));
        kh.setTen(rs.getString("ten"));
        kh.setGioiTinh(rs.getString("gioitinh"));
        kh.setDiaChi(rs.getString("diachi"));
        kh.setSdt(rs.getString("sdt"));
        kh.setNgaySinh(rs.getString("ngaysinh"));
        kh.setEmail(rs.getString("email"));
        return kh;
    }
}
