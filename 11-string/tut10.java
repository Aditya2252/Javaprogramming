import java.util.*;
public class tut10 {

    public static String Substing(String str,int start,int end){
        String string="";
        for(int i=start;i<=end;i++){
            string=string+str.charAt(i);

        }
        return string;
    }
    public static void main(String[] args) {
        String str="Aditya you are looking for the  following information in your database";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the start of the string:");
        int start=sc.nextInt();
        System.out.println("Enter the end of the string:");
        int end=sc.nextInt();

       String result= str.substring(start,end);
       System.out.println(result);
// 
        // String result=Substing(str, start, end);
        // System.out.println(result);
    }
    
}
