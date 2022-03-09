import java.util.Scanner;
public class App9 {
    public static void main(String[] args)
    {
        int dem1=0,dem2=0,dem3=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap mot chuoi ky tu bat ki: ");
        String tr=sc.nextLine();
        for(int i=0; i<tr.length(); i++)
        {
            if(tr.charAt(i)>= 'a' && tr.charAt(i) <= 'z') dem1++;
            else if(tr.charAt(i) >= 'A' && tr.charAt(i) <= 'Z') dem2++;
            else if(tr.charAt(i)>='0' && tr.charAt(i)<'9') dem3++;
        }
        System.out.print("so ky tu thuong: "+dem1);
        System.out.print("\nso ky tu hoa: "+dem2);
        System.out.print("\nso ky tu so: "+dem3);
    }
}
