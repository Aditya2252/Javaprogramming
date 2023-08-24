class tut1{
    public static void sort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1-i;j++){
                if (numbers[j]>numbers[j+1]) {
                    int temp=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=temp;
                    
                }

            }
        }
    }

public static void main(String[] args) {
    int numbers[]={3,6,2,1,8,7,4,5,3,1};
    sort(numbers);
    for(int i=0;i<numbers.length;i++){
       System.out.println(numbers[i]);
    }

    
}
}