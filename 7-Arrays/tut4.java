public class tut4 {

    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key=10;

        int index=linearsearch(numbers, key);
        if (index==-1) {
            System.out.println("Number are not present in array");

            
        }else{
            System.out.println("Index of number is"+index);
        }

    }
}
