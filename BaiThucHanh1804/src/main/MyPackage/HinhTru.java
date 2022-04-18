package MyPackage;

import java.util.Scanner;

public class HinhTru extends Hinhtron {
    public double chieuCao;
    Scanner sc = new Scanner(System.in);

    public HinhTru() {
        ten = "Hinh tru";
    }

    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.println("Nhap chieu cao: ");
        chieuCao = sc.nextDouble();
    }

    public void tinhTheTich() {
        tinhDienTich();
        thetich = (dientich * chieuCao);
    }

}
