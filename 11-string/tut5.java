/**
 * tut5
 */
public class tut5 {

    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String  str="noon";
        boolean result=ispalindrome(str);
        System.out.println(result);
    }
}