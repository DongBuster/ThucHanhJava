import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b;
        System.out.print("nhap a:");
        a=sc.nextDouble();
        System.out.print("nhap b: ");
        b=sc.nextDouble();
        sc.close();
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        if(a==b)  System.out.print("hai so bang nhau");
        else if(a>b)  System.out.print("a lon hon b");
        else if(a<b)  System.out.print("a nho hon b");
       
    }
}
