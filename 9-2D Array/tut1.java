import java.util.*;

class tut1{


    public static boolean search(int numbers[] [] ,int key){
        for(int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers.length;j++){
                if (numbers[i][j]==key) {
                    System.out.println("Element is found at ("+i+""+","+j+")");
                    return true;
                    
                }
                
                
            }
        }
        return false;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Hello world");
        int numbers [][]=new int[3][3];
        int m=numbers.length;
        int n=numbers[0].length;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
       boolean result= search(numbers, 5);
       if (result==true) {
        System.out.println("element is present in numbers");
        
       }else{
        System.out.println("Element are not present in numbers");
       }
    }
}