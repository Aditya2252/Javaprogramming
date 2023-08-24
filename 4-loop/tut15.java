import java.util.*;
public class tut15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    boolean isprime=true;
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            isprime=false;
        }
    }
    if (isprime==true) {
        System.out.println("N is prine");

        
    }else{
        System.out.println("Number is not prime");
    }
        
    }
}
