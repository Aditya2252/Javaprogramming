public class tut11 {

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
        int numbers[]={2,4,6,8,10,12,14};
        pair(numbers);

    }
}
