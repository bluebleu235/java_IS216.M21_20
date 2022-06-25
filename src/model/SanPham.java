/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhokk
 */
public class SanPham {

    private String maSP, ten, loaiSanPham;
    private int donGia, soLuong;

    public String getMaSP() {
        return maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public SanPham(String maSP, String ten, String loaiSanPham, int donGia, int soLuong) {
        this.maSP = maSP;
        this.ten = ten;
        this.loaiSanPham = loaiSanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public SanPham() {
    }

}
