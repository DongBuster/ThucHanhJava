import java.util.Scanner;
public class App9 {
    public static void main(String[] args)
    {
        int n,temp,sodaonguoc=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap n: ");
        n=sc.nextInt();
        sc.close();
        do
        {
            sodaonguoc*=10;
            temp=n%10;
            sodaonguoc+=temp;
            n=n/10;
        }while(n>0);
        System.out.print("so dao nguoc: "+sodaonguoc);
    }
}
