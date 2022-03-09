import java.util.Scanner;

public class App74 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n,sum=0;
      do
      {
          System.out.print("nhap so phan tu cua mang: ");
          n=sc.nextInt();
      }while(n<0);
    
      int array[]= new int[n];
      for(int i=0; i<n; i++)
      {
          System.out.print("nhap phan tu thu "+i+": ");
          array[i]=sc.nextInt();
      }
      for(int i=0; i<n; i++)
      {
          if(array[i] %2 ==0) sum+=array[i];
      }
      System.out.print("tong cac phan tu chan:"+sum);
    }
}
