import java.util.Scanner;
public class App3 {
    public static void main(String[] args)
    {
    int n,count=0;
    Scanner sc= new Scanner(System.in);
    do
    {
    System.out.println("nhap n");
    n=sc.nextInt();
    sc.close();
    }while(n<0);
    if(n<2) System.out.println("khong phai la so nguyen to");
    while(n>=2)
    {
    for(int i=2; i<Math.sqrt(n); i++)
    {
        if(n%i==0) count++;
    }
    if(count==0)System.out.println("day la so nguyen to");
    else System.out.println("khong phai la so nguyen to");
    }

    }
}
