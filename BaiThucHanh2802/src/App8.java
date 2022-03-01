import java.util.Scanner;
public class App8 {
    public static void main(String[] args)
    {
        
        double n,max=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("nhap so thuc: ");
            n=sc.nextDouble();
            if(n%5==0 && n>max) max=n;
        }while(n!=0);
        sc.close();
        System.out.println("max trong cac so chia het cho 5 vua nhap: "+max);
    }
}
