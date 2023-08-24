public class tut4 {

    public static void selectionsort(int numbers[]){
        for(int turn=0;turn<numbers.length-1;turn++){
            int large=turn;
            for(int j=turn+1;j<numbers.length;j++){
                if(numbers[large]<numbers[j]){
                    large=j;

                }
                int temp=numbers[large];
                numbers[large]=numbers[turn];
                numbers[turn]=temp;

            }
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,1,5,9,7,3,0,10,15};
        selectionsort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }

    }
    
}
