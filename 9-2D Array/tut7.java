public class tut7 {

public static int digonal(int numbers[][]){
    int sum=0;
    for(int i=0;i<numbers.length-1;i++){
        for(int j=0;j<numbers.length-1;j++){
            if(i==j){
                sum=sum+numbers[i][j];
            }else if(i+j==numbers.length-1){
                sum=sum+numbers[i][j];
            }

        }
       
    }
    return sum;
}


public static void main(String[] args) {
 int numbers[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,23}};
int result=digonal(numbers);
System.out.println(result);
}    
}
