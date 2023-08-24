public class tut3 {
    
    public static void selectionsort(int numbers[]){
         for(int i=0;i<numbers.length-1;i++){
            int minimum=i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[minimum]>numbers[j]){
                    minimum=j;
                }
                int temp=numbers[minimum];
                numbers[minimum]=numbers[i];
                numbers[i]=temp;

            }

         }
    }
    
    public static void main(String[] args) {
        int numbers[]={5,8,12,2,3};
        selectionsort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
