/**
 * tut16
 */
public class tut16 {

    public static void main(String[] args) {
        String str="aaad";
        String reveString=new StringBuilder(str).reverse().toString();
        System.out.println(reveString);
        if(str.equals(reveString)){
            System.out.println("Given String  in palindrome");
        }else{
            System.out.println("Given string is not in palindrome");
        }

    }
}