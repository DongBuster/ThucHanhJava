package Person;

public class Student extends Person {
    public String TenTruong;

    public Student(String TenTruong, String hoten, int tuoi) {
        super(hoten, tuoi);
        this.TenTruong = TenTruong;
    }

    public void inTruong() {
        System.out.println("Tên trường: " + TenTruong);
    }
}
