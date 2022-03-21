import java.util.Scanner;
import java.util.Date;
public class SinhVien {
    public String MaSinhVien;
    public String Hoten;
    public boolean GioiTinh;
    public String DiaChi;
    public Date Ngaysinh;
    Scanner sc= new Scanner(System.in);
    void nhapthongtin()
    {
        System.out.print("nhap ho ten: ");
        Hoten=sc.next();
        System.out.print("nhap ma sinh vien: ");
        MaSinhVien=sc.next();
        System.out.print("nhap Gioi tinh: ");
        GioiTinh=sc.nextBoolean();
        System.out.print("nhap dia chi: ");
        DiaChi=sc.next();
        System.out.print("nhap ngay sinh: ");
        
    }
    void inthongtin()
    {
        System.out.println("Ho ten: "+Hoten+"\n");
        System.out.println("Ma sinh vien: "+MaSinhVien+"\n");
        System.out.println("Gioi tinh: "+GioiTinh+"\n");
        System.out.println("Dia chi: "+DiaChi+"\n");
        System.out.println("Ngay sinh: "+Ngaysinh+"\n");
    }

}
