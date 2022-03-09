
import java.util.Scanner;
public class App90 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap chuoi ki tu: ");
        String tr=sc.nextLine();
        
        for(int i=0; i<tr.length();i++)
        {
            char kytu=tr.charAt(i);
            System.out.println(kytu);
        }
    }
}
