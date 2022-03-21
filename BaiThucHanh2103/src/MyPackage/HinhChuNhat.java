package MyPackage;
import java.util.Scanner;
public class HinhChuNhat {
    Scanner sc= new Scanner(System.in);
    private int chieudai;
    private int chieurong;
    private double cv;
    private double dt;
    public void nhap()
    {
        System.out.print("nhap chieu dai: ");
         chieudai=sc.nextInt();
         System.out.print("nhap chieu rong: ");
         chieurong=sc.nextInt();
    }
    
     public void chuvi()
    {
        cv=chieurong+chieudai;
    }
     public void dientich(){
         dt=chieurong*chieudai;
    }
    public void inchuvi(){
        System.out.println("chu vi: "+cv);
    }
    public void indientich(){
        System.out.println(" dientich: "+dt);
    }


}
