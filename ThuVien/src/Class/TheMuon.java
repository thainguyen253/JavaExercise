package Class;

import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    //thuoc tinh
    private int soMuon;
    private Date ngayMuon;
    private Date hanTra;
    private String soHieu;

    //phuong thuc
    //ham khoi tao khong doi so
    public TheMuon () {

    }
    //ham khoi tao co doi so
    public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
        this.soMuon=soMuon;
        this.ngayMuon=ngayMuon;
        this.soHieu=soHieu;

    }
    // ham nhap


    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("Nhap so muon: ");
        soMuon=sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ngay muon: ");
        String strNgayMuon=sc.nextLine();
        ngayMuon=strToDate(strNgayMuon);

        String strNgayTra="31-12-2022";
        hanTra=strToDate(strNgayTra);

        System.out.println("Nhap so hieu: ");
        soHieu=sc.nextLine();
    }
    private Date strToDate(String strNgayMuon) {
        Date date=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=sdf.parse(strNgayMuon);
        } catch (ParseException e) {
            System.out.println("Ban nhap ngay thang sai dinh dang!");
        }
        return date;
    }
    //ham hien thi

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So phieu muon: "+soMuon);
        System.out.println("Ngay muon: "+ngayMuon);
        System.out.println("Han tra: "+hanTra);
        System.out.println("So hieu: "+soHieu);
    }
    // ham lay ra thong tin han tra

    public Date getHanTra() {
        return hanTra;
    }
}
