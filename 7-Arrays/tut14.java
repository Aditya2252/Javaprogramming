/**
 * tut14
 */
public class tut14 {
   
   
    public static void printsubarray(int numbers[]){
        int ts=0;
         int maxsum=Integer.MIN_VALUE;
         int minsum=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int sum=0;
               

                

                for(int k=start;k<end;k++){
                    sum=sum+numbers[k];

                    // System.out.print(numbers[k]+" ");
                    

                }
                if (maxsum<sum) {
                    maxsum=sum;
                    
                }
                if(minsum>sum){
                    minsum=sum;
                }
                       


               // ts++;
                 System.out.println("Sum is :=" + sum);
                //System.out.println();
               
            }
            //System.out.println();
           
        
        }
        System.out.println("Maximum sum is :=" + maxsum);
        System.out.println("Minimum value is :+ "+minsum );
        //  System.out.println("Max sum is:="+ maxsum);
      
    
    }


    public static void main(String[] args) {
        int numbers[]={5,10,15,20,25,30,35,40};
        printsubarray(numbers);
    }
}