import java.util.Scanner;
import java.util.Arrays;

public class tut3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<numbers.length;i++){
             numbers[i]=sc.nextInt();

        }
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        Arrays.sort(numbers);
       String sort= (Arrays.toString(numbers));
       System.out.println(sort);
        String reverse=new StringBuilder(sort).reverse().toString();
        System.out.println(reverse);
    }
    
}
