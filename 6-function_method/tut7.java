import java.util.Scanner;

public class tut7 {
    /*
     * FUNCTION OVERLOADING :=
     * 
     * Multiple Function with the same name but diffrent parameter:
     */

    public static int multiply(int a, int b) {
        System.out.println("Multiplication between two number is:=");
        int multi = a * b;
        return multi;

    }

    public static float multiply(float a,float b){
         System.out.println("Multiplication between two number is:=");
           float multi = a * b;
         return multi;

    }

    public static void main(String[] args) {
        int a=10;
        int b=12;
        float c=102.12f;
        float d=111.20f;

        int multiplication=multiply(a, b);
        System.out.println(multiplication);
        float second=multiply(c, d);
        System.out.println(second);
    }

    }

