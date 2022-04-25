package Person;

public class FullTimeEmployee extends Employee {
    public String HinhThucLv;

    public FullTimeEmployee(String HinhThucLv, String ChucVu, String hoten, int tuoi) {
        super(ChucVu, hoten, tuoi);
        this.HinhThucLv = HinhThucLv;
    }

    public void inHinhThuc() {
        System.out.println("Hình thức hoc: " + HinhThucLv);
    }
}