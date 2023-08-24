import java.util.*;

public class tut5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row ");
        int m=sc.nextInt();
        System.out.println("Enter the size of column");
        int n=sc.nextInt();
        int numbers[][]=new int [m][n];
        // int k=numbers.length;
        // int l=numbers[0].length;
// 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                numbers[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j]+" ");

            }
            System.out.println();
        }
    }

}
