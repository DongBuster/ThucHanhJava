
import MyPackage.HinhChuNhat;
import MyPackage.HinhTru;
import MyPackage.HinhVuong;
import MyPackage.Hinhtron;

public class App54 {
    public static void main(String[] args) {
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.xuatTen();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inchuvi();
        hinhtron.indientich();

        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();

        HinhChuNhat hinhchuNhat = new HinhChuNhat();
        hinhchuNhat.xuatTen();
        hinhchuNhat.nhap();
        hinhchuNhat.tinhChuVi();
        hinhchuNhat.tinhDienTich();
        hinhchuNhat.inchuvi();
        hinhchuNhat.indientich();

        HinhTru hinhtru = new HinhTru();
        hinhtru.xuatTen();
        hinhtru.nhapChieuCao();
        hinhtru.tinhTheTich();
        hinhtru.inthetich();

    }
}
