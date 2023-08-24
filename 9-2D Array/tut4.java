import java.util.Scanner;

public class tut4 {

    public static int small(int numbers[][],int m,int n){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (smallest>numbers[i][j]) {
                    
                    smallest=numbers[i][j];
                }
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of row");
        int m=sc.nextInt();
        System.out.println("Enter size of column");
        int n=sc.nextInt();
        System.out.println("Enter element in array");
        int numbers [] [] =new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

               numbers[i][j]=sc.nextInt();
            }
            
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        int result=small(numbers,m,n);
        System.out.println(result);

        
    }
    
}
