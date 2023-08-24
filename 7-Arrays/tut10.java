public class tut10 {

    public static void reverse(int numbers[]) {
        int start = 0;
        int last = numbers.length - 1;
        while (start < last) {
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;
            start++;
            last--;

        }
        
        

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 45, 6, 7, 8, 9, 4 };
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }

}
