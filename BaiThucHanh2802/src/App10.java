import java.util.Scanner;
public class App10 {
    public static void main(String[] args)
    { 
        String n;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap n: ");
        n=sc.nextLine();
        sc.close();
        System.out.print("co "+n.length()+" chu so");
    }
}
