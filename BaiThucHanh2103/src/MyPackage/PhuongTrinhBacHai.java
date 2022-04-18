package MyPackage;
import java.util.Scanner;
public class PhuongTrinhBacHai {
    private int a;
    private int b;
    private int c;
    private double delta;
    Scanner sc= new Scanner(System.in);
   public PhuongTrinhBacHai()
    {
        a=0;
        b=0;
        c=0;
        delta=0;
    }
    public PhuongTrinhBacHai(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    public void nhapheso()
    {

    System.out.println("nhap he so a: ");
     a=sc.nextInt();
    System.out.println("nhap he so b: ");
     b=sc.nextInt();
    System.out.println("nhap he so c: ");
     c=sc.nextInt();
    }
    public void giaipt()
    {

    delta = b*b - 4*a*c;
    double x1;
    double x2;
    
        if(delta==0)
        {
            x1=-b/2*a;
            System.out.println("phuong trinh co nghiem kep:"+"x1=x2="+x1);
        }
        else if(delta<0) System.out.println("phuong trinh vo nghiem");
        else if(delta>0) 
        {
            x1=(-b + Math.sqrt(delta))/(2*a);
            x2=(-b - Math.sqrt(delta))/(2*a);
            System.out.println("phuong trinh co hai nghiem :"+ "x1 = " + x1 +" x2 = " + x2);
        }
    }
}
