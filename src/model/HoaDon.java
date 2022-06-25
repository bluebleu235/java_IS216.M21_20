/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhokk
 */
public class HoaDon {

    private String maHD, taiKhoanKH, ngayHoaDon, trangThai;

    public String getMaHD() {
        return maHD;
    }

    public String getTaiKhoanKH() {
        return taiKhoanKH;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setMaHD(String maHoaDon) {
        this.maHD = maHoaDon;
    }

    public void setTaiKhoanKH(String taiKhoanKH) {
        this.taiKhoanKH = taiKhoanKH;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public HoaDon(String maHoaDon, String taiKhoanKH, String ngayHoaDon, String trangThai) {
        this.maHD = maHoaDon;
        this.taiKhoanKH = taiKhoanKH;
        this.ngayHoaDon = ngayHoaDon;
        this.trangThai = trangThai;
    }

    public HoaDon() {
    }

}
