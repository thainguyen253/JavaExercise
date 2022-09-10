package SuDungClass;

import QuanLyNhanVienHienTai.NhanVien;
import QuanLyNhanVienHienTai.KinhNghiem;
import QuanLyNhanVienHienTai.Fresher;
import QuanLyNhanVienHienTai.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyNhanVien {

    private List<NhanVien> nhanViens;

    public QuanLyNhanVien() {
        this.nhanViens = new ArrayList<>();
    }

    public void insert(NhanVien nhanVien) {
        this.nhanViens.add(nhanVien);
    }

    public NhanVien findById(String id) {
        return this.nhanViens.stream().filter(nhanVien -> nhanVien.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean deleteById(String id) {
        NhanVien nhanVien = this.findById(id);
        if (nhanVien == null) {
            return false;
        }
        this.nhanViens.remove(nhanVien);
        return true;
    }

    public List<NhanVien> findByType(int type) {
        return this.nhanViens.stream()
                .filter(employee -> {
                    if (type == 0) {
                        return employee instanceof KinhNghiem;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<NhanVien> findAll() {
        return this.nhanViens;
    }


}
