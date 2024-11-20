package baitapweb.sinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public abstract class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String ngaySinh;
    private int namVaoHoc;
    private double diemDauVao;
    private List<KetQuaHocTap> ketQuaHocTap;

    public SinhVien(String maSinhVien, String hoTen, String ngaySinh, int namVaoHoc, double diemDauVao) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.namVaoHoc = namVaoHoc;
        this.diemDauVao = diemDauVao;
        this.ketQuaHocTap = new ArrayList<>();
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public int getNamVaoHoc() {
        return namVaoHoc;
    }

    public double getDiemDauVao() {
        return diemDauVao;
    }

    public List<KetQuaHocTap> getKetQuaHocTap() {
        return ketQuaHocTap;
    }

    public void themKetQuaHocTap(KetQuaHocTap ketQua) {
        this.ketQuaHocTap.add(ketQua);
    }

    public abstract boolean laChinhQuy();

    @Override
    public String toString() {
        return "Ma sinh vien: " + maSinhVien + ", Ho ten: " + hoTen + ", Ngay sinh: " + ngaySinh +
                ", Nam vao hoc: " + namVaoHoc + ", Diem dau vao: " + diemDauVao + ", Ket qua hoc tap: " + ketQuaHocTap;
    }
}