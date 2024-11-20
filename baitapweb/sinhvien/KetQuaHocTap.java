package baitapweb.sinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class KetQuaHocTap {
    private String tenHocKy;
    private double diemTrungBinhHocKy;

    public KetQuaHocTap(String tenHocKy, double diemTrungBinhHocKy) {
        this.tenHocKy = tenHocKy;
        this.diemTrungBinhHocKy = diemTrungBinhHocKy;
    }

    public String getTenHocKy() {
        return tenHocKy;
    }

    public double getDiemTrungBinhHocKy() {
        return diemTrungBinhHocKy;
    }

    @Override
    public String toString() {
        return "Hoc ky: " + tenHocKy + ", Diem trung binh: " + diemTrungBinhHocKy;
    }
}
