/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.NhanVien;
import helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.SanPham;

/**
 *
 * @author nhokk
 */
public class NhanVienDao {

    public NhanVien checkLogin(String tenDangNhap, String matKhau)
            throws Exception {
        String sql = "select taikhoanNV, matkhauNV from NHANVIEN "
                + "where taikhoanNV='" +tenDangNhap +"' and matkhauNV='" +matKhau +"'";
        try (
                 Connection con = DatabaseHelper.openConnection();  
                Statement statement = con.createStatement();
                //reparedStatement pstmt = con.prepareStatement(sql);
            ){
            //pstmt.setString(1, tenDangNhap);
            //pstmt.setString(2, matKhau);
            
            
            try ( ResultSet rs = statement.executeQuery(sql);) {
                if (rs.next()) {
                    NhanVien nv = new NhanVien();
                    nv.setTaikhoanNV(tenDangNhap);
                    nv.setMatkhauNV(matKhau);
                    return nv;
                }
            }
        }
        return null;
    }
    
        public NhanVien findById(String masp)
            throws Exception {
        String sql = "select * FROM Nhanvien Where taikhoannv = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, masp);

            try ( ResultSet rs = pstmt.executeQuery();) {
                NhanVien sp = new NhanVien();
                if (rs.next()) {
                    sp = createNhanVien(rs);
                }
                return sp;
            }
        }
    }
    
    public boolean InsertNew(String TaikhoanNV, String MatkhauNV)
            throws Exception {
        String sql = "INSERT INTO NHANVIEN(TAIKHOANNV, MATKHAUNV) VALUES (?,?)";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, TaikhoanNV);
            pstmt.setString(2, MatkhauNV);
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean Update(NhanVien nv)
            throws Exception {
        String sql = "Update NHANVIEN SET Ten = ?, NgaySinh = ?, GioiTinh = ?, SDT = ?, EMAIL = ?, DIACHI = ? where TAIKHOANNV = ?";
        try (
                 Connection con = DatabaseHelper.openConnection(); //Statement statement = con.createStatement();
                  PreparedStatement pstmt = con.prepareStatement(sql);) {           
            pstmt.setString(1, nv.getTen());
            pstmt.setString(2, nv.getNgaysinh());
            pstmt.setString(3, nv.getGioitinh());
            pstmt.setString(4, nv.getDienthoai());
            pstmt.setString(5, nv.getEmail());
            pstmt.setString(6, nv.getDiachi());
            pstmt.setString(7, nv.getTaikhoanNV());
            return pstmt.executeUpdate() > 0;
        }
    }
    
        private NhanVien createNhanVien(final ResultSet rs) throws SQLException {
        NhanVien nv = new NhanVien();
        nv.setTaikhoanNV(rs.getString("taikhoannv"));
        nv.setTen(rs.getString("ten"));
        nv.setNgaysinh(rs.getString("ngaysinh"));
        nv.setGioitinh(rs.getString("gioitinh"));
        nv.setDienthoai(rs.getString("sdt"));
        nv.setEmail(rs.getString("Email"));
        nv.setDiachi(rs.getString("DiaChi"));
        return nv;
    }
}

