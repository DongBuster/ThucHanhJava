
public class App11 {
    public static void main(String[] args)
    {
    int dem=0;
      for(int i=1; i<=20; ++i) 
          for(int j=1; j<=10; ++j)
              for(int k=1; k<=4; ++k)
                if(i*10000+j*20000+k*50000 == 200000) dem++;
          
      System.out.println("co "+dem+" phuong an");

    }
}
