/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhokk
 */
public class ThongTinHoaDon {

    private String maHD, maSP;
    private int soLuong;

    public ThongTinHoaDon() {
    }

    public ThongTinHoaDon(String maHD, String maSP, int soLuong) {
        this.maHD = maHD;
        this.maSP = maSP;
        this.soLuong = soLuong;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
