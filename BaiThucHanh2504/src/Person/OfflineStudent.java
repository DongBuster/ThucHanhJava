package Person;

public class OfflineStudent extends Student {
    public String HinhThuc;

    public OfflineStudent(String HinhThuc, String TenTruong, String hoten, int tuoi) {
        super(TenTruong, hoten, tuoi);
        this.HinhThuc = HinhThuc;
    }

    public void inHinhThuc() {
        System.out.println("Hình thức hoc: " + HinhThuc);
    }
}
