/**
 * tut3
 */
import java.util.*;
public class tut3 {

    public static void update(int prize[]){
        for(int i=0;i<prize.length;i++){
            prize[i]=prize[i]+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prize[]={97,98,99};
        update(prize);
        for(int i=0;i<=prize.length-1;i++){
            System.out.println(prize[i]);

        }
        System.out.println();

    }
}