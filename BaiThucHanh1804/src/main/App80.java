
import MyPackage2.NhanVienFullTime;
import MyPackage2.NhanVienPartTime;
import MyPackage2.config;

public class App80 {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van A");
        sep.setLoaiChucVu(config.NHAN_VIEN_SEP);
        NhanVienFullTime nv1 = new NhanVienFullTime("Nguyen Van B");
        NhanVienFullTime nv2 = new NhanVienFullTime("Nguyen Van C", 3);
        NhanVienPartTime nv3 = new NhanVienPartTime("Nguyen Van D", 300);
        sep.tinhSalary();
        nv1.tinhSalary();
        nv2.tinhSalary();
        nv3.tinhSalary();
        sep.XuatThongTin();
        nv1.XuatThongTin();
        nv2.XuatThongTin();
        nv3.XuatThongTin();
    }
}