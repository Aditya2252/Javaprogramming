import java.util.Scanner;

/**
 * tut1
 */
public class tut4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age of candidate is :="+age);
        if(age>=18){
            System.out.println("Candidate are adult");
        }
       else  if (age>13 && age<18) {
            System.out.println("Teenager");
            
        }


        else  {
            System.out.println("candidate are not adult");
        }
    }
}