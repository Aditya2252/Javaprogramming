public class tut13 {
    
    public static void subarray(int numbers[]){
        for (int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int eng=j;
                for(int k=start;start<=eng;k++){
                    System.out.println(numbers[k]+"");
                }
                System.out.println();

            }
            System.out.println();
        }

    }
    
    
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        subarray(numbers);

    }
    
}
