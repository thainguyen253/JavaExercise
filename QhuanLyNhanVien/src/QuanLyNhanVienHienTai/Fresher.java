package QuanLyNhanVienHienTai;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends NhanVien {

    private LocalDate ngayTotNghiep;
    private String xepHangTotNghiep;
    private String tenTruongDaiHoc;

    public Fresher() {
    }

    public Fresher(LocalDate ngayTotNghiep, String xepHangTotNghiep, String tenTruongDaiHoc) {
        this.ngayTotNghiep = ngayTotNghiep;
        this.xepHangTotNghiep = xepHangTotNghiep;
        this.tenTruongDaiHoc = tenTruongDaiHoc;
    }

    public Fresher(String id, String hoTen, LocalDate ngaySinh, String soDienThoai, String email, List<BangCap> bangCaps, LocalDate ngayTotNghiep, String xepHangTotNghiep, String tenTruongDaiHoc) {
        super(id, hoTen, ngaySinh, soDienThoai, email, bangCaps);
        this.ngayTotNghiep = ngayTotNghiep;
        this.xepHangTotNghiep = xepHangTotNghiep;
        this.tenTruongDaiHoc = tenTruongDaiHoc;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public LocalDate getNgayTotNghiep() {
        return ngayTotNghiep;
    }

    public void setNgayTotNghiep(LocalDate ngayTotNghiep) {
        this.ngayTotNghiep = ngayTotNghiep;
    }

    public String getXepHangTotNghiep() {
        return xepHangTotNghiep;
    }

    public void setXepHangTotNghiep(String xepHangTotNghiep) {
        this.xepHangTotNghiep = xepHangTotNghiep;
    }

    public String getTenTruongDaiHoc() {
        return tenTruongDaiHoc;
    }

    public void setTenTruongDaiHoc(String tenTruongDaiHoc) {
        this.tenTruongDaiHoc = tenTruongDaiHoc;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "id='" + id + '\'' +
                ", Ho Ten='" + hoTen + '\'' +
                ", Ngay Sinh=" + ngaySinh +
                ", So dien thoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", Ngay tot nghiep=" + ngayTotNghiep +
                ", Xep hang top nghiep='" + xepHangTotNghiep + '\'' +
                ", Ten truong Dai hoc='" + tenTruongDaiHoc + '\'' +
                '}';
    }
}