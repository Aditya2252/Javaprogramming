import java.util.*;


public class tut17 {

    public static int palindraome(int n){
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
            n=n/10;
          }
          return rev;


    }
   
   
   
    public static void main(String[] args) {

        // to check the number is palindraome

        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
       int result= palindraome(n);
        if (result==n) {
            System.out.println("Number is in palindrome");
            
        }else{
            System.out.println("Number is not in palindrome");
        }
        
        
    }
}
