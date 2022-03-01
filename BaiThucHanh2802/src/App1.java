import java.util.Scanner;

public class App1 {
    public static void main(String[] args)  {
        int a,b;
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("nhap so a: ");
            a=sc.nextInt();
            System.out.println("nhap so b: ");
            b=sc.nextInt();
        }while(a<=0 && b<=0);
        sc.close();
        if(a==0 || b==0) System.out.println("UCLN : "+(a+b));
        while(a!=b) 
        {
            if(a>b) a-=b;
            else b-=a;
        }
        System.out.println("UCLN : "+a);
    }
}
