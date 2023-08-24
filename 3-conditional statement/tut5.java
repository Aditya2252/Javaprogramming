import java.util.Scanner;

public class tut5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int income=sc.nextInt();
        if(income==500000){
            System.out.println("There are no any tax");
        }
        else if(income>600000 && income<1000000){
            double  tax=income*0.2;
            System.out.println("total tax is :="+tax);


        }
        else{
            double  tax= income*0.3;
            System.out.println("tax amount above 10lakh is :="+tax);
        }




         
    }
}
