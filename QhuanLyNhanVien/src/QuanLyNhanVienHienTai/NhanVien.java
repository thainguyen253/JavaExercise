package QuanLyNhanVienHienTai;


import java.time.LocalDate;
import java.util.List;

public abstract class NhanVien {
    public static long count = 0;
    protected String id;
    protected String hoTen;
    protected LocalDate ngaySinh;
    protected String soDienThoai;
    protected String email;
    protected List<BangCap> bangCaps;

    public NhanVien() {}

    public NhanVien(String id, String hoTen, LocalDate ngaySinh, String soDienThoai, String email, List<BangCap> bangCaps) {
        this.id = id;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.bangCaps = bangCaps;
    }

    public abstract void showInformation();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        this.ngaySinh = ngaySinh;
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BangCap> getCertificates() {
        return bangCaps;
    }

    public void setCertificates(List<BangCap> certificates) {
        this.bangCaps = bangCaps;
    }
}
