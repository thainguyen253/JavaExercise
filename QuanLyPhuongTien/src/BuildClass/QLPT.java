package BuildClass;

import java.util.Scanner;

public class QLPT {
    //Thuoc tinh
    protected String hangSX;
    protected int namSX;
    protected double gia;
    protected String mau;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public QLPT() {

    }

    //Ham khoi tao co doi so
    public QLPT(String hangSX,int namSX,double gia,String mau) {
        this.hangSX=hangSX;
        this.namSX=namSX;
        this.gia=gia;
        this.mau=mau;
    }

    //Ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap vao hang san xuat: ");
        hangSX=sc.nextLine();
        System.out.print("\tNhap vao nam san xuat: ");
        namSX=sc.nextInt(); sc.nextLine();
        System.out.print("\tNhap vao gia: ");
        gia=sc.nextDouble(); sc.nextLine();
        System.out.print("\tNhap vao mau sac: ");
        mau=sc.nextLine();
    }
    //Ham hien thi thong tin
    public void hienThiThongTin() {
        System.out.print("\tHang san xuat: "+hangSX);
        System.out.print("\tNam san xuat: "+namSX);
        System.out.print("\tGia: "+gia);
        System.out.print("\tMau: "+mau);
    }
    //Ham lay mau xe
    public String getMau() {
        return mau;
    }
}