/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.ThongTinHoaDon;
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
public class ThongTinHoaDonDao {

    public List<ThongTinHoaDon> findAll()
            throws Exception {
        String sql = "select * FROM ThongTinHoaDon";
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            //pstmt.setString(1, taikhoanKH);

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<ThongTinHoaDon> list = new ArrayList<>();
                while (rs.next()) {
                    ThongTinHoaDon hd = createThongTinHoaDon(rs);
                    list.add(hd);
                }
                return list;
            }
        }
    }

    public List<ThongTinHoaDon> findByMaHD(String MaHD)
            throws Exception {
        String sql = "select * FROM ThongTinHoaDon Where MaHD = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, MaHD);

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<ThongTinHoaDon> list = new ArrayList<>();
                while (rs.next()) {
                    ThongTinHoaDon hd = createThongTinHoaDon(rs);
                    list.add(hd);
                }
                return list;
            }
        }
    }

    public ThongTinHoaDon findByID(String MaSP, String MaHD)
            throws Exception {
        String sql = "select * FROM ThongTinHoaDon Where MaSP = ? and MaHD = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, MaSP);
            pstmt.setString(2, MaHD);
            try ( ResultSet rs = pstmt.executeQuery();) {
                ThongTinHoaDon tthd = null;
                if (rs.next()) {
                   tthd  = createThongTinHoaDon(rs);
                }
                return tthd;
            }
        }
    }

    public boolean Insert(ThongTinHoaDon tthd)
            throws Exception {
        String sql = "INSERT INTO THONGTINHOADON VALUES (?,?,?)";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tthd.getMaHD());
            pstmt.setString(2, tthd.getMaSP());
            pstmt.setInt(3, tthd.getSoLuong());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean Update(ThongTinHoaDon tthd)
            throws Exception {
        String sql = "Update ThongTinHoaDon set SoLuong = ?where MaHD = ? and MaSp = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, tthd.getSoLuong());
            pstmt.setString(2, tthd.getMaHD());
            pstmt.setString(3, tthd.getMaSP());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean Delete(ThongTinHoaDon tthd)
            throws Exception {
        String sql = "Delete From ThongTinHoaDon Where MaHD = ? and MaSP = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tthd.getMaHD());
            pstmt.setString(2, tthd.getMaSP());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean DeleteHD(String MaHD)
            throws Exception {
        String sql = "Delete From ThongTinHoaDon Where MaHD ='" + MaHD + "'";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            return pstmt.executeUpdate() > 0;
        }
    }

    private ThongTinHoaDon createThongTinHoaDon(final ResultSet rs) throws SQLException {
        ThongTinHoaDon tthd = new ThongTinHoaDon();
        tthd.setMaHD(rs.getString("mahd"));
        tthd.setMaSP(rs.getString("masp"));
        tthd.setSoLuong(rs.getInt("Soluong"));
        return tthd;
    }
}
