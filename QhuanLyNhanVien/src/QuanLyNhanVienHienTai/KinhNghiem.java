package QuanLyNhanVienHienTai;

import java.time.LocalDate;
import java.util.List;

public class KinhNghiem extends NhanVien {
    private int soNamKinhNghiem;
    private String kiNangChuyenMon;

    public KinhNghiem() {
    }

    public KinhNghiem(int soNamKinhNghiem, String kiNangChuyenMon) {
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.kiNangChuyenMon = kiNangChuyenMon;
    }

    public KinhNghiem(String id, String hoTen, LocalDate ngayThang, String soDienThoai, String email, List<BangCap> bangCaps, int soNamKinhNghiem, String kiNangChuyenMon) {
        super(id, hoTen, ngayThang, soDienThoai, email, bangCaps);
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.kiNangChuyenMon = kiNangChuyenMon;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public String getKiNangChuyenMon() {
        return kiNangChuyenMon;
    }

    public void setKiNangChuyenMon(String kiNangChuyenMon) {
        this.kiNangChuyenMon = kiNangChuyenMon;
    }

    @Override
    public String toString() {
        return "Kinh Nghiem{" +
                "id='" + id + '\'' +
                ", Ho Ten='" + hoTen + '\'' +
                ", Ngay Sinh=" + ngaySinh +
                ", So Dien Thoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", So Nam Kinh Nghiem =" + soNamKinhNghiem +
                ", Ki Nang Chuyen Mon='" + kiNangChuyenMon + '\'' +
                '}';
    }
}