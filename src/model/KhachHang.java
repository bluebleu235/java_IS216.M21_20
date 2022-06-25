/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhokk
 */
public class KhachHang {

    private String taiKhoanKH, ten, gioiTinh, ngaySinh, diaChi, email, sdt;

    public String getTaiKhoanKH() {
        return taiKhoanKH;
    }

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setTaiKhoanKH(String taiKhoanKH) {
        this.taiKhoanKH = taiKhoanKH;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public KhachHang(String taiKhoanKH, String ten, String gioiTinh, String ngaySinh, String diaChi, String email, String sdt) {
        this.taiKhoanKH = taiKhoanKH;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
    }

    public KhachHang() {
    }

}
