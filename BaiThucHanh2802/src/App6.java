import java.util.Scanner;
public class App6 {
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n: ");
        n=sc.nextInt();
         sc.close();
         System.out.println("cac so hoan thien nho hon n: ");
        for( i=1; i<n; i++)
        {
            int sum=0;
            for(int k=1; k<i; k++)
            {
                if(i%k==0) sum+=k;
            }
            if(sum==i) System.out.print(i+" ");
        }
    }
}
