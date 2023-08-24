import java.util.*;
public class tut10 {
    public static void main(String[] args) {
        // Calculator create using java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("value of a :="+a);
        System.out.println("Enter the value of b");
        int b= sc.nextInt();
        System.out.println("Value of b is "+b);
        System.out.println("Enter operatorin which you want perform operation");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println("Addition is :=  "+(a+b));
            break;
            case '-': System.out.println("subraction is :="+(a-b));
            break;
            case '*': System.out.println("Multiplication is:="+ (a*b));
            break;
            case '/':System.out.println(  "Devidation is := "+(a/b) );
            break;

            case '%':System.out.println(a%b);
            break;

            default:System.out.println("You Enter Wrong operator");
        }

    }
}
