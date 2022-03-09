import java.util.Scanner;
public class App6 {
    public static void main(String[] args)
    { 
        int n,gt=1;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("nhap so n: ");
            n=sc.nextInt();
        }while(n<0);
        sc.close();
        for(int i=1; i<=n; i++)
        {
            gt*=i;
        }
        System.out.print("Giai thua cua n: "+gt);
    }
}
