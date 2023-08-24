import java.util.Scanner;

public class tut16 {

    public static String names(String name,int start,int end){
        String str="";
        for(int i=start;i<end;i++){
            str=str+name.charAt(i);
        }
        return str;

    }
    public static void main(String[] args) {
        String name="this is very best place to find the name of the program";
        Scanner sc=new Scanner(System.in);
        System.out.println("start:=");
        int start=sc.nextInt();
        System.out.println("end:=");
        int end=sc.nextInt();

        String result=names(name, start, end);
        System.out.println(result);

    }
}
