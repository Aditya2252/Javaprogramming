import java.util.Scanner;

/**
 * tut2
 */
public class tut2 {
    public static int calculatesum(int a,int b) {//formal parameter:= formal parameter are used to function defination

        int sum = a + b;
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a,b);// actual parameter are used to send actual value in function

    }

}