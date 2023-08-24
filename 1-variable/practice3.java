import java.util.*;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil");
        float a=sc.nextFloat();
        System.out.println("Enter the cost of pen");
        float b=sc.nextFloat();
        System.out.println("Enter the cost of eracer");
        float c =sc.nextFloat();
        
        float total=a+b+c;

        float gst= total/0.18f;

        float totalbill= total+gst;
        System.out.println("Total bill is :=");


        System.out.println(totalbill);


        




    }
}
