package MyPackage2;

public class NhanVien {
    protected String ten;
    protected int salary;

    public NhanVien() {
        ten = "";
        salary = 0;
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    protected String LoaiNhanVien() {
        return "";
    }

    public void XuatThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Loai nhan vien: " + LoaiNhanVien());
        System.out.println("Luong: " + salary);
    }

}
