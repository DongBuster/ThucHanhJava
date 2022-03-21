package MyPackage;
import java.util.Scanner;

public class PerSon {
    private String PerSonID;
    private String PerSonName;
    private boolean gender;
    private String Address;
    Scanner sc=new Scanner(System.in);
   
    public void nhapthongtin(){
        System.out.print("nhap PerSonName: ");
        PerSonName=sc.nextLine();
        sc.nextLine();
        System.out.print("nhap Address: ");
        Address=sc.nextLine();
        System.out.print("nhap PerSonID: ");
        PerSonID=sc.next();
        System.out.print("nhap gender: ");
        gender=sc.nextBoolean();
    }
    public void inthongtin(){
        System.out.print("PerSonName: "+PerSonName+"\n");
        System.out.print("PerSonID: "+PerSonID+"\n");
        System.out.print("Gender: "+gender+"\n");
        System.out.print("Address: "+Address+"\n");
    }

}
