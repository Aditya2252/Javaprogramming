import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int year=sc.nextInt();
        if (year%4==0) {
            System.out.println("Year is leap year");
            
        }else if(year%100==0){
            System.out.println("year is leap year");
        }else if (year%400==0) {
            System.out.println("year is leap year");
            
        }else{
            System.out.println("Year is not leap year");
        }

    }
}
