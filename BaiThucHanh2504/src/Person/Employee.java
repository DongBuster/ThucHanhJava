package Person;

public class Employee extends Person {
    public String ChucVu;

    public Employee(String ChucVu, String hoten, int tuoi) {
        super(hoten, tuoi);
        this.ChucVu = ChucVu;
    }

    public void inChucVu() {
        System.out.println("Chức vụ: " + ChucVu);
    }
}