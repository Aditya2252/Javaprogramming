import java.util.Scanner;

public class tut8 {

    public static boolean isprime(int n){
       boolean isPrime=true;
       if (n==2) {
        return true;
        
       }

        for(int i=2;i<=n-1;i++){
            if (n%i==0) {
               return false;

                
            }



        }
        return  isPrime;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=isprime(n);
        System.out.println(result);

        if (result==true) {
            System.out.println("Given number is prime");
            
        }else{
            System.out.println("Number is not prime");
        }

        
    }
}
