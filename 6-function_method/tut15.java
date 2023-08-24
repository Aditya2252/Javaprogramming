import java.util.Scanner;

/**
 * tut15
 */
public class tut15 {
    public static int avg(int a,int b,int c){
        int sum=a+b+c;
        int average=a+b+c/3;

        return average;
    
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int result=avg(a, b, c);
        System.out.println(result);
    }
}