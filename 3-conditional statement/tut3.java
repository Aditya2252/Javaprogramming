import java.util.Scanner;

public class tut3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
         System.out.println("Given number is even");

        }
        if(n==2){
            System.out.println("Number is even-prime number");
        }
    
        else{
            System.out.println("Given number is odd");
        }
    }
}
 