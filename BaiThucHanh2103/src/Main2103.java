

import MyPackage.HinhChuNhat;
import MyPackage.PerSon;
import MyPackage.PhuongTrinhBacHai;
import MyPackage.SinhVien;



public class Main2103 {
    public static void main(String[] args)  {
        HinhChuNhat ht= new HinhChuNhat();
        ht.nhap();
        ht.chuvi();
        ht.inchuvi();
        ht.dientich();
        ht.indientich();
        //Person
        PerSon p= new PerSon();
        p.nhapthongtin();
        System.out.print("\n");
        p.inthongtin();
        // Sinhvien
        SinhVien sv= new SinhVien();
        sv.nhapthongtin();
        sv.inthongtin();
    //     // PhuongTrinhBacHai
        PhuongTrinhBacHai pt= new PhuongTrinhBacHai();
        pt.nhapheso();
        pt.giaipt();
    }
}
    