package Person;

public class Person {
    public String hoten;
    public int tuoi;

    public Person(String hoten, int tuoi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
    }

    public void inHoten() {
        System.out.println("Họ tên: " + hoten);
    }

    public void inTuoi() {
        System.out.println("Tuổi: " + tuoi);
    }
}