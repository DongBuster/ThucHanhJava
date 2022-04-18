package MyPackage2;

// import MyPackage2.config;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String LoaiNhanVien() {
        return "Nhân viên thời vụ";
    }

    public void tinhSalary() {
        salary = (config.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec);
    }

}
