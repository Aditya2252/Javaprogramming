public class tut8 {

    public static int search(int marks[],int key){
        int left=0;
        int right=marks.length-1;
        while (left<=right) {
            int mid=(left+right)/2;
            if (marks[mid]==key) {
                return mid;

                
            }if(key>marks[mid]){
                left=mid+1;

            }if(key<marks[mid]){
                right=mid-1;
            }

            
        }
        return -1;

    }
    public static void main(String[] args) {
        int marks[]={96,95,94,93,22,35,66,98,97,41};
        int key=98;

        int result=search(marks, key);
        System.out.println(result);

    }
    
}
