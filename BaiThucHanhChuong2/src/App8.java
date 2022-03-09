import java.util.Scanner;
public class App8 {
    public static void main(String[] args)
    {
        int n,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap n so nguyen: ");
        n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("nhap 1 so nguyen bat ky: ");
            temp=sc.nextInt();
            sum+=temp;
        }
        sc.close();
        System.out.print("Trung binh cong cac so vua nhap la: "+(sum/n));
    }
}
