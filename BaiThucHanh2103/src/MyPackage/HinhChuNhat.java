package MyPackage;
import java.util.Scanner;
public class HinhChuNhat {
    Scanner sc= new Scanner(System.in);
    private int chieudai;
    private int chieurong;
    private double cv;
    private double dt;
   public HinhChuNhat()
    {
        chieudai=0;
        chieurong=0;
        cv=0;
        dt=0;
    }
    public HinhChuNhat(int chieudai, int chieurong)
    {
        this.chieudai=chieudai;
        this.chieurong=chieurong;
        cv=chieudai*chieurong;
        dt=chieudai+chieurong;
    }
    public void nhap()
    {
        System.out.print("nhap chieu dai: ");
        chieudai=sc.nextInt();
        System.out.print("nhap chieu rong: ");
        chieurong=sc.nextInt();
    }
    public void in()
    {
       
        cv=chieudai*chieurong;
        dt=chieudai+chieurong;
        System.out.println("chu vi: "+cv+"\n");
        System.out.println("dien tich: "+dt+"\n");
    }
    


}
