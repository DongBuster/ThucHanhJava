

import MyPackage.HinhChuNhat;
import MyPackage.PerSon;
import MyPackage.PhuongTrinhBacHai;
import MyPackage.SinhVien;



public class Main2103 {
    public static void main(String[] args)  {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap();
        hcn.in();

        //Person
        PerSon p= new PerSon();
        p.nhapthongtin();
        p.inthongtin();

        // Sinhvien
        SinhVien sv= new SinhVien();
        sv.nhapthongtin();
        sv.inthongtin();
        
        // PhuongTrinhBacHai
        PhuongTrinhBacHai pt= new PhuongTrinhBacHai();
        pt.nhapheso();
        pt.giaipt();
    }
}

    