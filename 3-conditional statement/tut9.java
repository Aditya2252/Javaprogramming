import java.util.Scanner;

public class tut9 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       switch(number) {
        case 1: System.out.println("samosa");
        case 2: System.out.println("burger");
        break;
        case 3: System.out.println("mango shake");
        break;
        case 4: System.out.println("Fruit");
        break;
        default :System.out.println(" Invalid choice We wake up from sleep");
       }
    }
}
