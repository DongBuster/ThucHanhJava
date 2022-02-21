import java.util.Scanner;


public class App30 {
   
    public static void main(String[] args)  {
        int sum=0;
        int number, x;
        Scanner sc=new Scanner(System.in);
       
        do
        {
            System.out.println(" Nhap so nguyen duong: ");
            number=sc.nextInt();
        }while(number<=0);
        while(number>0)
        {
        x=number%10;
        sum+=x;
        number/=10;
        }
        System.out.println("tong: "+sum);
    }
}
