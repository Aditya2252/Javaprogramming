import java.util.Scanner;

public class tut13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int power=0;
        int decimal=0;
        while(n>0){
           int lastdigit=n%10;
           decimal=decimal+(lastdigit*(int)Math.pow(2, power));
           n=n/10;
           power++;



        }

        System.out.println(decimal);
    }
    
}
