//Question 3 : Write a Java program to input week number(1-7) and print day of week name
// using switch case.


import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a week day number");
        int number =sc.nextInt();
        switch(number){
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tusaday");
            break;
            case 4 : System.out.println("Wendsaday");
            break;
            case 5 : System.out.println("Thursaday");
            break;
            case 6 :System.out.println("Friday"); 
            break;
            case 7:System.out.println("Saturday");
            break;
            default : System.out.println("You are Enter a wrong choice");

             
        }


    }
    
}
