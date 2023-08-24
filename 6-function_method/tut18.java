import java.util.Scanner;

public class tut18 {

    public static boolean ispalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;

            }
             left++;
             right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        
        
        if (ispalindrome(str)) {
            System.out.println("This will be in palindrome");
            
        }else{
            System.out.println("Not in palindrome");
        }

    }

}
