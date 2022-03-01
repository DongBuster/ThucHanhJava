import java.util.Scanner;
public class App5 {
    public static void main(String[] args)
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n: ");
        n=sc.nextInt();
        sc.close();
        for(int i=1; i<n; i++)
        {
            if(n%i==0) sum+=i;
        }
        if(sum==n) System.out.println("la so hoan thien");
        else System.out.println("khong la so hoan thien");
    }
}
