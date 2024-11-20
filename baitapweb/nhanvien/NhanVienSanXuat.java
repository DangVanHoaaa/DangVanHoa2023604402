package baitapweb.nhanvien;



public class NhanVienSanXuat extends NhanVien {
    private int soSanPham;

    public NhanVienSanXuat(String hoTen, int namVaoLam, int soSanPham) {
        super(hoTen, namVaoLam);
        this.soSanPham = soSanPham;
        tinhLuong();
    }

    @Override
    public void tinhLuong() {
        setLuong(soSanPham * 10000);
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
        tinhLuong();
    }

    @Override
    public String toString() {
        return super.toString() + ", So san pham: " + soSanPham;
    }
}
