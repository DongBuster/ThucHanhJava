package Person;

public class main {
    public static void main(String[] args) {
        Customer cus = new Customer("VN", "Nguyễn Văn A", 20);
        cus.inHinhThuc();
        cus.inHoten();
        cus.inTuoi();

        Student stu = new Student("ĐH Bách Khoa", "Nguyễn Văn B", 20);
        stu.inTruong();
        stu.inHoten();
        stu.inTuoi();

        Employee emp = new Employee("Giám đốc", "Nguyễn Văn C", 20);
        emp.inChucVu();
        emp.inHoten();
        emp.inTuoi();
    }
}
