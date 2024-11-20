package baitapweb.nhanvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QuanLyNhanVien {
    public static void main(String[] args) {
        List<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin nhân viên sản xuất
        System.out.println("Nhap thong tin nhan vien san xuat:");
        System.out.print("Ho ten: ");
        String hoTenSX = scanner.nextLine();
        System.out.print("Nam vao lam: ");
        int namVaoLamSX = scanner.nextInt();
        System.out.print("So san pham: ");
        int soSanPham = scanner.nextInt();
        NhanVienSanXuat nvsx = new NhanVienSanXuat(hoTenSX, namVaoLamSX, soSanPham);
        danhSachNhanVien.add(nvsx);

        // Nhập thông tin nhân viên văn phòng
        scanner.nextLine(); // Đọc bỏ dòng mới
        System.out.println("Nhap thong tin nhan vien van phong:");
        System.out.print("Ho ten: ");
        String hoTenVP = scanner.nextLine();
        System.out.print("Nam vao lam: ");
        int namVaoLamVP = scanner.nextInt();
        System.out.print("Muc luong: ");
        double mucLuong = scanner.nextDouble();
        System.out.print("Ngay nghi: ");
        int ngayNghi = scanner.nextInt();
        NhanVienVanPhong nvvp = new NhanVienVanPhong(hoTenVP, namVaoLamVP, mucLuong, ngayNghi);
        danhSachNhanVien.add(nvvp);

        // Tính tổng số tiền công ty phải trả cho nhân viên mỗi tháng
        double tongLuong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.getLuong() + nv.getPhuCap();
        }
        System.out.println("Tong so tien cong ty phai tra cho nhan vien moi thang: " + tongLuong);
    }
}

