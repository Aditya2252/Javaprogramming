/**
 * tut18
 */
public class tut18 {

    public static int  linearsearch(int numbers[],int target){
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==target){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        int target=4;
        int result=linearsearch(numbers, target);
        System.out.println(target);
    }
}