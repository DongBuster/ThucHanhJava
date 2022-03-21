import java.util.Scanner;
public class HinhChuNhat {
    Scanner sc= new Scanner(System.in);
    public int chieudai;
    public int chieurong;
    public double cv;
    public double dt;
     void nhap()
    {
        System.out.print("nhap chieu dai: ");
         chieudai=sc.nextInt();
         System.out.print("nhap chieu rong: ");
         chieurong=sc.nextInt();
    }
    
     void chuvi()
    {
        cv=chieurong+chieudai;
    }
     void dientich(){
         dt=chieurong*chieudai;
    }
    void inchuvi(){
        System.out.println("chu vi: "+cv);
    }
    void indientich(){
        System.out.println(" dientich: "+dt);
    }


}
