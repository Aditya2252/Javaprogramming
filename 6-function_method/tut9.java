import java.util.*;

public class tut9 {


    public static boolean isprime(int n){

        if (n==2) {
            return true;

            
        }
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                return false;

                
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter The number");
        int n=sc.nextInt();
        boolean result=isprime(n);
        System.out.println(result);
        if (result == true){
            System.out.println("Given Number is Prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
    
}
