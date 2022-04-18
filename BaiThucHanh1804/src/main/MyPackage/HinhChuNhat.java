package MyPackage;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {

    Scanner sc = new Scanner(System.in);
    public int chieudai;
    public int chieurong;

    public HinhChuNhat() {
        ten = "Hinh chu nhat";
    }

    public HinhChuNhat(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;

    }

    public void nhap() {
        System.out.print("nhap chieu dai: ");
        chieudai = sc.nextInt();
        System.out.print("nhap chieu rong: ");
        chieurong = sc.nextInt();
    }

    public void tinhChuVi() {
        chuvi = 2 * (chieudai + chieurong);
    }

    public void tinhDienTich() {
        dientich = chieudai * chieurong;
    }

}
