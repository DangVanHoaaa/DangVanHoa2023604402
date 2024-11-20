package baitapweb.sinhvien;



public class SinhVienTaiChuc extends SinhVien {
    private String noiLienKetDaoTao;

    public SinhVienTaiChuc(String maSinhVien, String hoTen, String ngaySinh, int namVaoHoc, double diemDauVao, String noiLienKetDaoTao) {
        super(maSinhVien, hoTen, ngaySinh, namVaoHoc, diemDauVao);
        this.noiLienKetDaoTao = noiLienKetDaoTao;
    }

    public String getNoiLienKetDaoTao() {
        return noiLienKetDaoTao;
    }

    @Override
    public boolean laChinhQuy() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Noi lien ket dao tao: " + noiLienKetDaoTao;
    }
}
