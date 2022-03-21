import java.util.Scanner;

public class PerSon {
    public String PerSonID;
    public String PerSonName;
    public boolean gender;
    public String Address;
    Scanner sc=new Scanner(System.in);
   
    void nhapthongtin(){
        System.out.print("nhap PerSonID: ");
        PerSonID=sc.next();
        System.out.print("nhap PerSonName: ");
        PerSonName=sc.nextLine();
        System.out.print("nhap Address: ");
        Address=sc.nextLine();
        System.out.print("nhap gender: ");
        gender=sc.nextBoolean();
    }
    public String getPerSonID(String PerSonID)
    {
        return PerSonID;
    }
    public String getPerSonName(String PerSonName)
    {
        return PerSonName;
    }
    public boolean getGender(boolean gender)
    {
        return gender;
    }
    public String getAddress(String Address)
    {
        return Address;
    }
    void inthongtin(){
        System.out.print("PerSonName: "+PerSonName+"\n");
        System.out.print("PerSonID: "+PerSonID+"\n");
        System.out.print("Gender: "+gender+"\n");
        System.out.print("Address: "+Address);
    }

}
