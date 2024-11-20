package baitapweb.sinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Khoa {
    private String tenKhoa;
    private List<SinhVien> danhSachSinhVien;

    public Khoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
        this.danhSachSinhVien = new ArrayList<>();
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public List<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void themSinhVien(SinhVien sinhVien) {
        this.danhSachSinhVien.add(sinhVien);
    }

    public int tongSoSinhVienChinhQuy() {
        int count = 0;
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.laChinhQuy()) {
                count++;
            }
        }
        return count;
    }

    public SinhVien sinhVienDiemDauVaoCaoNhat() {
        SinhVien sinhVienCaoNhat = null;
        for (SinhVien sv : danhSachSinhVien) {
            if (sinhVienCaoNhat == null || sv.getDiemDauVao() > sinhVienCaoNhat.getDiemDauVao()) {
                sinhVienCaoNhat = sv;
            }
        }
        return sinhVienCaoNhat;
    }

    public List<SinhVienTaiChuc> danhSachSinhVienTaiChucNoiLienKet(String noiLienKetDaoTao) {
        List<SinhVienTaiChuc> danhSachTaiChuc = new ArrayList<>();
        for (SinhVien sv : danhSachSinhVien) {
            if (!sv.laChinhQuy() && ((SinhVienTaiChuc) sv).getNoiLienKetDaoTao().equalsIgnoreCase(noiLienKetDaoTao)) {
                danhSachTaiChuc.add((SinhVienTaiChuc) sv);
            }
        }
        return danhSachTaiChuc;
    }

    public List<SinhVien> danhSachSinhVienDiemTrungBinhCao() {
        List<SinhVien> danhSachCao = new ArrayList<>();
        for (SinhVien sv : danhSachSinhVien) {
            if (!sv.getKetQuaHocTap().isEmpty()) {
                KetQuaHocTap ketQuaCuoi = sv.getKetQuaHocTap().get(sv.getKetQuaHocTap().size() - 1);
                if (ketQuaCuoi.getDiemTrungBinhHocKy() >= 8.0) {
                    danhSachCao.add(sv);
                }
            }
        }
        return danhSachCao;
    }

    public SinhVien sinhVienDiemTrungBinhCaoNhat() {
        SinhVien sinhVienCaoNhat = null;
        for (SinhVien sv : danhSachSinhVien) {
            for (KetQuaHocTap kq : sv.getKetQuaHocTap()) {
                if (sinhVienCaoNhat == null || kq.getDiemTrungBinhHocKy() > sinhVienCaoNhat.getKetQuaHocTap().get(0).getDiemTrungBinhHocKy()) {
                    sinhVienCaoNhat = sv;
                }
            }
        }
        return sinhVienCaoNhat;
    }
}
