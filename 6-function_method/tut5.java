import java.util.Scanner;

/**
 * tut5
 */
public class tut5 {


    public static int factorial(int n){
       int fact=1;
       for(int i=1;i<=n;i++){
        fact=fact*i;
       }
       return fact;

    }

    public static int binomial(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nminus=factorial(n-r);

        int binCoeff=n_fact/(r_fact*nminus);
        return binCoeff;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int total=binomial(n,r);
        System.out.println(total);

    }
}