/**
 * tut7
 */
public class tut7 {

    public static int binarysearch(int numbers[],int key){
        int left=0;
        int right=numbers.length-1;
        while (left<=right) {
            int mid=(left+right)/2;
            if (numbers[mid]==key) {
                return mid;

                
            }
            if(key>numbers[mid]){
                left=mid+1;

            }else{
                right=mid-1;

            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        // binary search

        int numbers[]={15};
        int key=45;

        int result=binarysearch(numbers, key);
        System.out.println(result);

    }
}