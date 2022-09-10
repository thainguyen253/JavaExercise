package QuanLyNhanVienHienTai;

import java.time.LocalDate;
import java.util.List;

public class Intern extends NhanVien {
    private String chuyenNganh;
    private int kiHoc;
    private String tenTruongDaiHoc;

    public Intern() {
    }

    public Intern(String chuyenNganh, int kiHoc, String tenTruongDaiHoc2) {
        this.chuyenNganh = chuyenNganh;
        this.kiHoc = kiHoc;
        this.tenTruongDaiHoc = tenTruongDaiHoc;
    }

    public Intern(String id, String hoTen, LocalDate ngaySinh, String soDienThoai, String email, List<BangCap> bangCaps, String chuyenNganh, int kiHoc, String tenTruongDaiHoc) {
        super(id, hoTen, ngaySinh, soDienThoai, email, bangCaps);
        this.chuyenNganh = chuyenNganh;
        this.kiHoc = kiHoc;
        this.tenTruongDaiHoc = tenTruongDaiHoc;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(int kiHoc) {
        this.kiHoc = kiHoc;
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
                ", Chuyen nganh =" +chuyenNganh  + '\'' +
                ", Ki hoc='" + kiHoc + '\'' +
                ", Ten truong Dai hoc='" + tenTruongDaiHoc + '\'' +
                '}';
    }
}
