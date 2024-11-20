package baitapweb.nhanvien;



public class NhanVienVanPhong extends NhanVien {
    private double mucLuong;
    private int ngayNghi;

    public NhanVienVanPhong(String hoTen, int namVaoLam, double mucLuong, int ngayNghi) {
        super(hoTen, namVaoLam);
        this.mucLuong = mucLuong;
        this.ngayNghi = ngayNghi;
        tinhLuong();
    }

    @Override
    public void tinhLuong() {
        setLuong(mucLuong - ngayNghi * 10000);
    }

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
        tinhLuong();
    }

    public int getNgayNghi() {
        return ngayNghi;
    }

    public void setNgayNghi(int ngayNghi) {
        this.ngayNghi = ngayNghi;
        tinhLuong();
    }

    @Override
    public String toString() {
        return super.toString() + ", Muc luong: " + mucLuong + ", Ngay nghi: " + ngayNghi;
    }
}

