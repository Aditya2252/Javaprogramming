/**
 * Innertut12
 */
public class tut12 {

    public static int  search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;

            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={1, 2, 3, 4, 5, 6};
       int result= search(numbers,5);
       System.out.println(result);
    }

    
}