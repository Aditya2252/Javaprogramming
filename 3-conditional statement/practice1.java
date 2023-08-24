//Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.



import java.util.Scanner;

public class practice1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float number=sc.nextFloat();
    if (number<0) {
        System.out.println("Given Number is Negative");

        
    }else{
        System.out.println("Given Number is Positive");
    }
   } 
}
