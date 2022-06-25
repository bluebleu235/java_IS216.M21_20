/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.SanPham;
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
public class SanPhamDao {

    public List<SanPham> findAll()
            throws Exception {
        String sql = "select * FROM SanPham";
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            //pstmt.setString(1, taikhoanKH);

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<SanPham> list = new ArrayList<>();
                while (rs.next()) {
                    SanPham sp = createSanPham(rs);
                    list.add(sp);
                }
                return list;
            }
        }
    }

    public SanPham findById(String masp)
            throws Exception {
        String sql = "select * FROM SANPHAM Where masp = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, masp);

            try ( ResultSet rs = pstmt.executeQuery();) {
                SanPham sp = new SanPham();
                if (rs.next()) {
                    sp = createSanPham(rs);
                }
                return sp;
            }
        }
    }

    public List<SanPham> findByLoaiSP(String loaisanpham)
            throws Exception {
        String sql = "select * FROM SANPHAM Where loaisanpham = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, loaisanpham);

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<SanPham> list = new ArrayList<>();
                while (rs.next()) {
                    SanPham sp = createSanPham(rs);
                    list.add(sp);
                }
                return list;
            }
        }
    }
    
    public List<SanPham> findByTenSP(String tensanpham)
            throws Exception {
        String sql = "select * FROM SANPHAM WHERE TEN LIKE '%"+ tensanpham +"%'";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<SanPham> list = new ArrayList<>();
                while (rs.next()) {
                    SanPham sp = createSanPham(rs);
                    list.add(sp);
                }
                return list;
            }
        }
    }

    public List<String> findLoaiSP()
            throws Exception {
        String sql = "select loaisanpham FROM SANPHAM";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {

            try ( ResultSet rs = pstmt.executeQuery();) {
                List<String> list = new ArrayList<>();
                while (rs.next()) {
                    String sp = rs.getString("loaisanpham");
                    if (list.contains(sp) == false) {
                        list.add(sp);
                    }
                }
                return list;
            }
        }
    }
    
    public int findSL(String MaSP)
            throws Exception {
        String sql = "select soluong FROM SANPHAM where MaSP ='" + MaSP + "'";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {

            try ( ResultSet rs = pstmt.executeQuery();) {
                int sl = 0;
                if (rs.next()) {
                    sl = rs.getInt("soluong");
                }
                return sl;
            }
        }
    }
    
    public String findMaSPByName(String Ten)
            throws Exception {
        String sql = "select MaSp FROM SANPHAM where Ten ='" + Ten + "'";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {

            try ( ResultSet rs = pstmt.executeQuery();) {
                String MaSp = null;
                if (rs.next()) {
                    MaSp = rs.getString("MaSP");
                }
                return MaSp;
            }
        }
    }
    
    public boolean Insert(SanPham sp)
            throws Exception {
        String sql = "INSERT INTO SANPHAM VALUES (?,?,?,?,?)";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, sp.getMaSP());
            pstmt.setString(2, sp.getTen());
            pstmt.setString(3, sp.getLoaiSanPham());
            pstmt.setInt(4, sp.getDonGia());
            pstmt.setInt(5, sp.getSoLuong());
            return pstmt.executeUpdate() > 0;
        }
    }
    
        public boolean Update(SanPham sp)
            throws Exception {
        String sql = "Update SANPHAM set Ten = ?, LoaiSanPham = ?, DonGia = ?, SoLuong = ? where Masp = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {           
            pstmt.setString(1, sp.getTen());
            pstmt.setString(2, sp.getLoaiSanPham());
            pstmt.setInt(3, sp.getDonGia());
            pstmt.setInt(4, sp.getSoLuong());
            pstmt.setString(5, sp.getMaSP());
            return pstmt.executeUpdate() > 0;
        }
    }
        
        public boolean UpdateSL(String MaSP, int SL)
            throws Exception {
        String sql = "Update SANPHAM SET SoLuong = SoLuong - ? where Masp = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {           
            pstmt.setInt(1, SL);
            pstmt.setString(2, MaSP);
            return pstmt.executeUpdate() > 0;
        }
    }
        
        public boolean Delete(SanPham sp)
            throws Exception {
        String sql = "Delete From SanPham Where maSP = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, sp.getMaSP());
            return pstmt.executeUpdate() > 0;
        }
    }


    private SanPham createSanPham(final ResultSet rs) throws SQLException {
        SanPham sp = new SanPham();
        sp.setMaSP(rs.getString("masp"));
        sp.setTen(rs.getString("ten"));
        sp.setLoaiSanPham(rs.getString("loaisanpham"));
        sp.setDonGia(rs.getInt("Dongia"));
        sp.setSoLuong(rs.getInt("SoLuong"));
        return sp;
    }
}
