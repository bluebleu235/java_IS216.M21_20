/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.HoaDon;
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
public class HoaDonDao {

    public List<HoaDon> findAll()
            throws Exception {
        String sql = "select * FROM HoaDon";
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            //pstmt.setString(1, taikhoanKH);

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<HoaDon> list = new ArrayList<>();
                while (rs.next()) {
                    HoaDon hd = createHoaDon(rs);
                    list.add(hd);
                }
                return list;
            }
        }
    }

    public HoaDon findById(String MaHD)
            throws Exception {
        String sql = "select * FROM HoaDon Where MaHD = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, MaHD);

            try ( ResultSet rs = pstmt.executeQuery();) {
                HoaDon sp = new HoaDon();
                if (rs.next()) {
                    sp = createHoaDon(rs);
                }
                return sp;
            }
        }
    }

 
    
    public List<HoaDon> findByMaKH(String taikhoanKH)
            throws Exception {
        String sql = "select * FROM HoaDon WHERE taikhoanKH LIKE '%"+ taikhoanKH +"%'";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<HoaDon> list = new ArrayList<>();
                while (rs.next()) {
                    HoaDon sp = createHoaDon(rs);
                    list.add(sp);
                }
                return list;
            }
        }
    }
    
        public List<HoaDon> findByMaHD(String MaHD)
            throws Exception {
        String sql = "select * FROM HoaDon WHERE MaHD LIKE '%"+ MaHD +"%'";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<HoaDon> list = new ArrayList<>();
                while (rs.next()) {
                    HoaDon sp = createHoaDon(rs);
                    list.add(sp);
                }
                return list;
            }
        }
    }

    
    public boolean Insert(HoaDon hd)
            throws Exception {
        String sql = "INSERT INTO HOADON VALUES (?,?,?,?)";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, hd.getMaHD());
            pstmt.setString(2, hd.getTaiKhoanKH());
            pstmt.setString(3, hd.getNgayHoaDon());
            pstmt.setString(4, hd.getTrangThai());       
     return pstmt.executeUpdate() > 0;
        }
    }
    
        public boolean Update(HoaDon hd)
            throws Exception {
        String sql = "Update HoaDon set TaiKhoanKH = ?, NgayHD = ?, TrangThai = ? where MaHD = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {           
            pstmt.setString(1, hd.getTaiKhoanKH());
            pstmt.setString(2, hd.getNgayHoaDon());
            pstmt.setString(3, hd.getTrangThai());
            pstmt.setString(4, hd.getMaHD());
            return pstmt.executeUpdate() > 0;
        }
    }
        
        public boolean Delete(HoaDon hd)
            throws Exception {
        String sql = "Delete From HoaDon Where MaHD = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, hd.getMaHD());
            return pstmt.executeUpdate() > 0;
        }
    }


    private HoaDon createHoaDon(final ResultSet rs) throws SQLException {
        HoaDon hd = new HoaDon();
        hd.setMaHD(rs.getString("mahd"));
        hd.setNgayHoaDon(rs.getString("ngayhoadon"));
        hd.setTaiKhoanKH(rs.getString("taikhoankh"));
        hd.setTrangThai(rs.getString("trangthai"));
        return hd;
    }
}
