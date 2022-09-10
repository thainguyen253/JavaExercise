package QuanLyNhanVienHienTai;

import java.time.LocalDate;

public class BangCap {
    private String id;
    private String ten;
    private String xepHang;
    private LocalDate ngayThang;

    public BangCap() {
    }

    public BangCap(String id, String name, String rank, LocalDate date) {
        this.id = id;
        this.ten = name;
        this.xepHang = rank;
        this.ngayThang = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getXepHang() {
        return xepHang;
    }

    public void setXepHang(String xepHang) {
        this.xepHang = xepHang;
    }

    public LocalDate getNgayThang() {
        return ngayThang;
    }

    public void setNgayThang(LocalDate ngayThang) {
        this.ngayThang = ngayThang;
    }
}
