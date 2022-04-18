package MyPackage;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    Scanner sc = new Scanner(System.in);

    public HinhVuong() {
        ten = "Hinh vuong";
    }

    public void nhapCanh() {
        System.out.print("nhap canh: ");
        chieudai = chieurong = sc.nextInt();
    }

}
