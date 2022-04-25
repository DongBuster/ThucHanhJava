package Person;

public class Customer extends Person {
    public String Tenkh;

    public Customer(String Tenkh, String hoten, int tuoi) {
        super(hoten, tuoi);
        this.Tenkh = Tenkh;
    }

    public void inHinhThuc() {
        System.out.println("Hình thức: " + Tenkh);
    }
}