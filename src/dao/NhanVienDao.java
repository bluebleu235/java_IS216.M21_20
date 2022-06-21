/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.NhanVien;
import helper.DatabaseHelper;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
}
