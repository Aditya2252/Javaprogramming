import java.util.*;

public class tut12 {
    public static void main(String[] args) {
        // calculate area of circle 

        float pi=3.14f;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the value of radius");
        int r=sc.nextInt();
        
        System.out.println("Area Of circle is:=");
        double area=pi*r*r;
        System.out.println(area);

    }
}
