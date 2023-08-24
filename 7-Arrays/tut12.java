public class tut12 {
    public static void pair(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int currunt=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+currunt+","+numbers[j]+")");

            }
            System.out.println();
        }

    }


   public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        pair(numbers);

    }
    
}
