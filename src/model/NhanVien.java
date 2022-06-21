/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhokk
 */
public class NhanVien {
    private String taikhoanNV, matkhauNV, ten, gioitinh, ngaysinh, diachi, email, dienthoai;

    public NhanVien(String taikhoanNV, String matkhauNV, String ten, String gioitinh, String ngaysinh, String diachi, String email, String dienthoai) {
        this.taikhoanNV = taikhoanNV;
        this.matkhauNV = matkhauNV;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.email = email;
        this.dienthoai = dienthoai;
    }
    public NhanVien(){}

    public String getTaikhoanNV() {
        return taikhoanNV;
    }

    public String getMatkhauNV() {
        return matkhauNV;
    }

    public String getTen() {
        return ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getEmail() {
        return email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setTaikhoanNV(String taikhoanNV) {
        this.taikhoanNV = taikhoanNV;
    }

    public void setMatkhauNV(String matkhauNV) {
        this.matkhauNV = matkhauNV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }
    
    
}
