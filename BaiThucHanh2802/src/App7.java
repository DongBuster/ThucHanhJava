import java.util.Scanner;
public class App7 {
    public static void main(String[] args)
    {
        double n,max=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("nhap so thuc: ");
            n=sc.nextDouble();
            if(n>max) max=n;
        }while(n!=0);
        sc.close();
        System.out.println("max trong cac so vua nhap: "+max);
    }
}
