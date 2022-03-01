import java.util.Scanner;
public class App4 {
   public static void main(String[] args)
   {
       int n,i;
       Scanner sc=new Scanner(System.in);
       System.out.println("nhap n: ");
       n=sc.nextInt();
        sc.close();
       for( i=2; i<n; i++)
       {
        int count=0;
       for(int k=2; k<=Math.sqrt(i); k++)
       {
           if(i%k==0) count++;
       }
       if(count==0) System.out.print(i+" ");
        }

   } 
}
