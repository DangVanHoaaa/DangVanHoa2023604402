package baitapweb.sinhvien;



public class SinhVienChinhQuy extends SinhVien {
    public SinhVienChinhQuy(String maSinhVien, String hoTen, String ngaySinh, int namVaoHoc, double diemDauVao) {
        super(maSinhVien, hoTen, ngaySinh, namVaoHoc, diemDauVao);
    }

    @Override
    public boolean laChinhQuy() {
        return true;
    }
}
