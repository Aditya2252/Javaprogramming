import java.util.*;

public class tut3 {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(temp);

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        swap(a,b);

    }

}
