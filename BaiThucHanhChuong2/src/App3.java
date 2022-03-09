import java.util.Scanner;


public class App3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ten: ");
        String hoten=sc.nextLine();
        System.out.print("nhap nam sinh: ");
        int namsinh=sc.nextInt();
        if(namsinh>=18)  System.out.print("Ban "+hoten+" da gia");
        else if(namsinh <16)  System.out.print("ban"+hoten+" o do tuoi vi thanh nien");
        else  System.out.print("ban "+hoten+" dang truong thanh");
    }
}
