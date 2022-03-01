import java.util.Scanner;

public class App2 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap canh a: ");
        a=sc.nextInt();
        System.out.println("nhap canh b: ");
        b=sc.nextInt();
        System.out.println("nhap canh c: ");
        c=sc.nextInt();
        sc.close();
        if(a<b+c && b<a+c && c<a+b) 
        {
            if(a==b && b==c) System.out.println("tam giac deu");
            else if((a*a==b*b+c*c && b==c) || (b*b==a*a+c*c && a==c) || (c*c==b*b+a*a && b==a)) System.out.println("tam giac vuong can");
            else if(a==b || b==c || a==c) System.out.println("tam giac can");    
            else if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==b*b+a*a) System.out.println("tam giac vuong");
            else System.out.println("tam giac thuong");
        }
        else System.out.println("khong phai la ba canh cua tam giac");
    }
}
