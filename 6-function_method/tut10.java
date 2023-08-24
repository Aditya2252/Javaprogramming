import java.util.*;

public class tut10 {

    public static boolean isprime(int n){
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;

            }
        

        }
        return isPrime;

    }

    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if (isprime(i)==true) {
                System.out.println(i+" ");
                
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        primeinrange(n);


    }
}
