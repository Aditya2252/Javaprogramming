import java.util.Scanner;

public class tut11 {
    // binary to integer
    public static void bintodec(int n ){
        int power=0;
        int dec=0;

        while (n>0){
            int lastdigit=n%10;
            dec= dec+(lastdigit*(int)Math.pow(2,power));
            power++;
            n=n/10;
           
        }
         System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bintodec(n);

    }

}
