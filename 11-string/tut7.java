public class tut7 {


    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str= "noon";

        boolean result=ispalindrome(str);
        System.out.println(result);

        if (result==true) {
            System.out.println("Number are in the palindrome");
            
        }else{
            System.out.println("Number are not in the palindrome");
        }
    }
    
}
