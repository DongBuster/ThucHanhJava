package MyPackage;

import java.util.Scanner;

public class Hinhtron extends HinhHoc {
    public double banKinh;
    Scanner sc = new Scanner(System.in);

    public Hinhtron() {
        ten = "Hinh tron";
    }

    public void nhapBanKinh() {
        System.out.println("Nhap ban kinh: ");
        banKinh = sc.nextDouble();
    }

    public void tinhChuVi() {
        chuvi = 2 * pi * banKinh;
    }

    public void tinhDienTich() {
        dientich = pi * banKinh * banKinh;
    }
}
