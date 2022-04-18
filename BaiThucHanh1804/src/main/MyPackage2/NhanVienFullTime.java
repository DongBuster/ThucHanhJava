package MyPackage2;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten) {
        this.ten = ten;
    }

    public NhanVienFullTime(String ten, int ngayLamThem) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String LoaiNhanVien() {
        return "Nhân viên full time";
    }

    public void tinhSalary() {
        if (loaiChucVu == config.NHAN_VIEN_SEP) {
            salary = config.LUONG_NHAN_VIEN_FULL_TIME_SEP;
        } else {
            salary = config.LUONG_NHAN_VIEN_FULL_TIME_LINH
                    + config.LUONG_NHAN_VIEN_LAM_THEM_MOI_NGAY * ngayLamThem;
        }
    }
}
