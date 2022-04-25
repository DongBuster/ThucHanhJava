package Person;

public class VIPCustomer extends Person {
    public String loaiKh;

    public VIPCustomer(String loaiKh, String hoten, int tuoi) {
        super(hoten, tuoi);
        this.loaiKh = loaiKh;
    }

    public void inHinhThuc() {
        System.out.println("Hình thức: " + loaiKh);

    }
}
