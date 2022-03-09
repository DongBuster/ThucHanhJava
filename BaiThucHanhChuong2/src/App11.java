import java.util.Scanner;

public class App11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap so phan tu ma tran: ");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("nhap phan tu ["+i+"] : ");
            array[i]=sc.nextInt();
        }
        sc.close();
       for(int i=0; i<n; i++)
       {
        System.out.println(array[i]);
       }
        for(int i=0; i<n; i++)
        for(int j=0; j<n; j++)
        {
            if(array[i]<array[j])
            {
                int temp=0;
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        System.out.print("mang sau khi sap xep tang dan:\n");
        for(int i=0; i<n; i++)
       {
        System.out.println(array[i]);
       }
    }
}
