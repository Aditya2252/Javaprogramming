public class tut15 {

    // heare i want to calculate sub array in form of following

    /*[2,3,4,5,6,7,8,9]
     * sub array is =[2,3],[2,3,4],[2,3,4,5],[2,3,4,5,6],[2,3,4,5,6,7],[2,3,4,5,6,7,8]
     * then i want to calculate sum of each sub array
     * then i want to calculate Minimum and maximum form that sum
     * 
     * Lets Started =>
     * 
     */

    public static void subArray(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;

        

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i+1;j<numbers.length;j++){
                int end=j;
                int sum=0;
                
                for (int k=start;k<end;k++){
                    // System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                if(largest<sum){
                    largest=sum;
                }

                if(minimum>sum){
                    minimum=sum;
                }
                 System.out.println("Sum is :="+sum);
                System.out.println();

            }
            
            
           
            System.out.println();


        }
        System.out.println(largest);
        System.out.println("Minimum value is :="+ minimum);
        
    }
     
     
     
     public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8,9};
        subArray(numbers);

     }

    
}
