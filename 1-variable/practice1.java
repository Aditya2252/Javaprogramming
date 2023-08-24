/**
 * practice1
 */
import java.util.*;

public class practice1 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a=sc.nextInt();
    System.out.println("Enter the value of b");
    int b=sc.nextInt();
    System.out.println("Enter the value of c");
    int c=sc.nextInt();

    System.out.println("Calculated average is a := ");
    int avg=a+b+c/3;
    System.out.println(avg);


    }
}