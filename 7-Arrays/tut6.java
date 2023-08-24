import java.util.*;

public class tut6 {

    public static void  largest(int numbers[]){
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]>large){
                large=numbers[i];
            }
            if (numbers[i]<small) {
                small=numbers[i];

                
            }
           
           
        }
         System.out.println(large);
         System.out.println(small);
      
      


    }
    public static void main(String[] args) {
        int numbers[]={97,98,99,100,10,102,552,141,336,585,964,741};
       // int highval=largest(numbers);
        
        //System.out.println("Largest value is :="+highval);
        //System.out.println("Smallest value is := ");
        largest(numbers);
        
    }
}
