package baitapweb.nhanvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lớp trừu tượng NhanVien
public abstract class NhanVien {
    private String hoTen;
    private int namVaoLam;
    private double luong;
    private double phuCap;

    public NhanVien(String hoTen, int namVaoLam) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
    }

    public abstract void tinhLuong();

    public String getHoTen() {
        return hoTen;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getPhuCap() {
        int namLamViec = 2024 - namVaoLam; 
        return 100000 + namLamViec * 20000;
    }

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", Nam vao lam: " + namVaoLam + ", Luong: " + luong + ", Phu cap: " + getPhuCap();
    }
}

