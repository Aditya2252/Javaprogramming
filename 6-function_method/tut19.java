import java.util.*;
public class tut19 {

    public static int calculatesum(int n){
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;

        }
        return sum;
    }
    public static void main(String[] args) {
        // to calculate sum of digit 

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int result=calculatesum(n);
        System.out.println(result);



    }
}
