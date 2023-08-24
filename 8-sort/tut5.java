import java.util.*;
import java.util.Collection;

public class tut5 {
    public static void bubblesort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
    }

    public static void insertion(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            int minimum=i;
            for(int j=i+1;j<numbers.length;j++){
                if (numbers[minimum]>numbers[j]) {
                    minimum=j;
                    
                }
                int temp=numbers[minimum];
                numbers[minimum]=numbers[i];
                numbers[i]=temp;

            }

        }
    }

    public static void sortdirect(int numbers[]){
        Arrays.sort(numbers);
    }
    public static void main(String[] args) {
        Integer [] numbers ={3,6,2,1,8,7,4,5,3,1};
       // Arrays.sort(numbers);
       // bubblesort(numbers);
        //insertion(numbers);
       //sortdirect(numbers);
     Arrays.sort(numbers,Collections.reverseOrder());
        
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);


        }
        

    }
    
}
