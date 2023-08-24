import java.util.Scanner;

public class tut2 {
    public static void main(String[] args) {
        // print largest of two number
        // int a,b;
        System.out.println("Enter the value of a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();

        if (a>b) {
            System.out.println("Heare a is greter than b");

            
        }else{
            System.out.println("b is  greter than a");
        }
    }

}
