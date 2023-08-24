// Question 2 : Finish the following code so that it prints You have a fever if your temperature
//is above 100 and otherwise prints You don't have a fever.

import java.util.Scanner;

public class practice2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your body temprature");
    double fever=sc.nextDouble();
    if (fever>100) {
        System.out.println("You have a Fever plese consult your family doctor and take medicine");

        
    }
    else if  (fever>75 && fever <100){
        System.out.println("You Have a syntoms of fever ");
        
    }
    else{
        System.out.println("you dont have fever dont be a panic ");
    }

    
}    
}
