import java.util.Scanner;

public class App35
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a=sc.nextInt();
        System.out.print("Nhap so b: ");
        b=sc.nextInt();
        int min;
        min=a<b?a:b;
        System.out.print("So nho nhat trong hai so a va b: "+min);
    }
}