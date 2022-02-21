import java.util.Scanner;

public class App47 {
    public static void main(String[] args) {
        int number,sum=0;
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("nhap so nguyen: ");
            number=sc.nextInt();
            sum+=number;
        }while(sum<100);
        System.out.println("tong cac so nguyen: "+sum);
    }
    
}
