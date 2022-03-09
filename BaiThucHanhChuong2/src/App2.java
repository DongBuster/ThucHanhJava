import java.util.Scanner;
public class App2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so n: ");
        int n=sc.nextInt();
        sc.close();
        if(n%2==0) System.out.print("n la so chan");
        else System.out.print("n la so le");

    }
}
