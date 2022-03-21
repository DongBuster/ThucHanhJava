import java.util.Scanner;
public class PhuongTrinhBacHai {
    public int a;
    public int b;
    public int c;
    public double delta;
    Scanner sc= new Scanner(System.in);
    void nhapheso()
    {

    System.out.println("nhap he so a: ");
     a=sc.nextInt();
    System.out.println("nhap he so b: ");
     b=sc.nextInt();
    System.out.println("nhap he so c: ");
     c=sc.nextInt();
    }
    void giaipt()
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
            x1=-b + Math.sqrt(delta)/2*a;
            x2=-b - Math.sqrt(delta)/2*a;
            System.out.println("phuong trinh co hai nghiem :"+ "x1 = " + x1 +" x2 = " + x2);
        }
    }
}
