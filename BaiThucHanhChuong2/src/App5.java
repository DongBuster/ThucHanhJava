import java.util.Scanner;
public class App5 {
    public static void main(String[] args)
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("nhap mot so nguyen bat ky: ");
             n=sc.nextInt();
            sum+=n;
        }while(sum<100);
        System.out.print("tong cac so vua nhap: "+sum);
    }
}
