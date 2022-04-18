package MyPackage;
import java.util.Scanner;

public class SinhVien {
    private String MaSinhVien;
    private String Hoten;
    private boolean GioiTinh;
    private String DiaChi;
    private String Ngaysinh;
    Scanner sc= new Scanner(System.in);
    public SinhVien(){
        MaSinhVien="";
        Hoten="";
        GioiTinh=false;
        DiaChi="";
        Ngaysinh="";
    }
   public  SinhVien(String maSinhVien, String Hoten, boolean GioiTinh, String DiaChi, String Ngaysinh){
        this.MaSinhVien=maSinhVien;
        this.Hoten=Hoten;
        this.GioiTinh=GioiTinh;
        this.DiaChi=DiaChi;
        this.Ngaysinh=Ngaysinh;
    }
    public void nhapthongtin()
    {
        System.out.print("nhap ho ten: ");
        Hoten=sc.nextLine();
        sc.nextLine();
        System.out.print("nhap ngay sinh: ");
        Ngaysinh=sc.nextLine();
        sc.nextLine();
        System.out.print("nhap dia chi: ");
        DiaChi=sc.nextLine();
        System.out.print("nhap ma sinh vien: ");
        MaSinhVien=sc.next();
        System.out.print("nhap Gioi tinh: ");
        GioiTinh=sc.nextBoolean();
    }
    public void inthongtin()
    {
        System.out.println("\nHo ten: "+Hoten+"\n");
        System.out.println("Ma sinh vien: "+MaSinhVien+"\n");
        System.out.println("Gioi tinh: "+GioiTinh+"\n");
        System.out.println("Dia chi: "+DiaChi+"\n");
        System.out.println("Ngay sinh: "+Ngaysinh+"\n");
        
    }

}

