package Person;

public class OnlineStudent extends Student {
    public String HinhThuc;

    public OnlineStudent(String HinhThuc, String TenTruong, String hoten, int tuoi) {
        super(TenTruong, hoten, tuoi);
        this.HinhThuc = HinhThuc;
    }

    public void inHinhThuc() {
        System.out.println("Hình thức hoc: " + HinhThuc);
    }
}
