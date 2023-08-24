import java.util.Scanner;

public class tut6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if ((a>=b) && (a>=c)){
            System.out.println("Gretest number is a=\n"+a);

        }else if(b>=c){
            System.out.println("Gretest Number is b:=\n"+b);

        }else{
            System.out.println("Gretest number is c:=\n"+c);
        }
            
        }
        

    }
 
