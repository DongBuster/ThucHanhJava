import java.util.Scanner;

public class App12 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int row,column;
        do
        {
            System.out.print("nhap so dong cua ma tran: ");
            row=sc.nextInt();
            System.out.print("nhap so cot cua ma tran: ");
            column=sc.nextInt();
        }while(row<0||column<0);
        int array[][] = new int[row][column];
        for(int i=0; i<row; i++)
        for(int j=0; j<column; j++)
        {
            System.out.print("nhap phan tu array["+i+"]"+"["+j+"]"+": ");
            array[i][j]=sc.nextInt();
        }
        sc.close();
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
                {
                    System.out.print(array[i][j]+"\t");
                }
                System.out.print("\n");
        }
        int max=array[0][0];
        for(int i=0; i<row; i++)
        for(int j=0; j<column; j++)
        {
            if(array[i][j]>max) max=array[i][j];
        }
        System.out.print("phan tu lon nhat trong mang: "+max);
    }
}
