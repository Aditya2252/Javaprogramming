public class tut2 {

    public static int max(int numbers[][]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if (large<numbers[i][j]) {
                    large=numbers[i][j];
                    
                }
                
            }
           
        }
         return large;
    }
    public static void main(String[] args) {
        int numbers[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=numbers.length;
        int m=numbers[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(numbers[i][j] + "");

            }
            System.out.println();
        }
       int largest= max(numbers);
       System.out.println(largest);

    }
    
    
}
