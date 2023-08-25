public class tut16 {
    public static int reverse(int a){
        int rev=0;
        while(a>0){
            int lastdigit=a%10;
            rev=(rev*10)+lastdigit;
            a=a/10;
        }
        return rev;
    }
    public static void main(String[] args) {
     int a=103;
    //  int result=reverse(a);
     String s=Integer.toString(a);
     StringBuilder str=new StringBuilder(s).reverse();
     System.out.println(str);
    //  if(a==result){
        // System.out.println("this is in palindrome");
    //  }else{
        // System.out.println("This is not in palindrome");
    //  }

    }
    
}
