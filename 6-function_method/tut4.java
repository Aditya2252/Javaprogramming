import java.util.*;

public class tut4 {
    public static int multiply(int a,int b){
        System.out.println("Multiplication between two number is:=");
        int multi=a*b;
        return multi;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
      int product=  multiply(a,b);
      System.out.println(product);



    }
}
