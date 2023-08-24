import java.util.Scanner;

public class tut8 {
    public static void main(String[] args) {
        // print reverse of number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         while (n>0) {
         int lastdigit=n%10;
         n=n/10;
         System.out.println(lastdigit);
        }

        System.out.println();

    }
}
