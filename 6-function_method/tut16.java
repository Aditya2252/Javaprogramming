import java.util.Scanner;

public class tut16 {

    public static int avg(int n){
          Scanner dc=new Scanner(System.in);
          int sum=0;

          for(int i=1;i<=n;i++){
            int number=dc.nextInt();
             System.out.println(number);
             sum=sum+number;
             
             

            
          }
          return sum;
         
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=avg(n);
        System.out.println(result);
        System.out.println("Average of this number is:=");
        int average=result/n;
        System.out.println(average);


    
    }
}
