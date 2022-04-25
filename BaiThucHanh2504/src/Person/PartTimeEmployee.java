package Person;

public class PartTimeEmployee extends Employee {
    public String HinhThucLv;

    public PartTimeEmployee(String HinhThucLv, String ChucVu, String hoten, int tuoi) {
        super(ChucVu, hoten, tuoi);
        this.HinhThucLv = HinhThucLv;
    }

    public void inHinhThuc() {
        System.out.println("Hình thức lam viec: " + HinhThucLv);
    }
}