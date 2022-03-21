import java.util.Scanner;
public class App10 {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap 1 ky tu: ");
        char c=sc.next().charAt(0);
        String tr;
        int dem=0;
        do{
            System.out.print("nhap mot chuoi ki tu bat ky: ");
            tr=sc.next();
        }while(tr.length()>80);
            sc.close();
        for(int i=0; i<tr.length(); i++)
        {
            if(tr.charAt(i) == c) dem++;
        }
        System.out.print("ky tu '"+c+"' xuat hien "+dem+" lan");
    }
}
