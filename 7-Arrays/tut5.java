import java.util.*;
public class tut5 {

    public static int  search(String str[],String key){
        for(int  i=0;i<str.length;i++){
        
            if(str[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str[]={"tea","chole","bhature","water","drink","coffe"};
        Scanner sc=new Scanner(System.in);
        String key= "bhature";
        
        int index=search(str, (String)key);
        System.out.println(index);
        if (index==-1) {
            System.out.println("String are not avialable in array");
            
        }else{
            System.out.println("location of string:=");
            System.out.println(index);
        }

    }
}
