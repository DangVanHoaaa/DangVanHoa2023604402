package baitapweb.sinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QuanLyKetQuaHocTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Khoa khoaCNTT = new Khoa("CNTT");
        Khoa khoaKinhTe = new Khoa("Kinh Tế");

       
        SinhVien sv1 = new SinhVienChinhQuy("SV01", "Nguyen Van A", "01/01/2000", 2020, 8.5);
        sv1.themKetQuaHocTap(new KetQuaHocTap("HK1", 8.0));
        sv1.themKetQuaHocTap(new KetQuaHocTap("HK2", 8.5));
        khoaCNTT.themSinhVien(sv1);

        SinhVien sv2 = new SinhVienTaiChuc("SV02", "Tran Thi B", "02/02/1999", 2019, 7.0, "Dong Nai");
        sv2.themKetQuaHocTap(new KetQuaHocTap("HK1", 7.5));
    }
}
