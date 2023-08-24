import java.util.Scanner;

class tut14 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int pow=0;
        int decimal=0;


        while (n>0) {
            int remender=n%2;
            decimal=decimal+(remender*(int)Math.pow(10, pow));
            pow++;
            n=n/2;

            
        }
        System.out.println("decimal Number is :="+decimal);

    }
}
