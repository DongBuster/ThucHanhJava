import java.util.Scanner;

public class App40
{
    public static void main(String[] args)
    {
        int ngay;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        ngay=sc.nextInt();
        System.out.print("tuan le "+ngay/6);
    }
}