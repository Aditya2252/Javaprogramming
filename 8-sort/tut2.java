import java.util.*;

public class tut2 {


    public static void reverseArray(int marks[]){
        int first=0;
        int last=marks.length-1;
        while(first<last){
            int temp= marks[last];
            marks[last]=marks[first];
            marks[first]=temp;
            first++;
            last--;


        }
    }

    public static void bubblesort(int marks[]){
      
        for(int i=0;i<marks.length-1;i++){
            for(int j=0;j<marks.length-1-i;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j+1];
                    marks[j+1]=marks[j];
                    marks[j]=temp;

                }
            }
        }


    }
    public static void main(String[] args) {
        int marks[]={10,20,100,999,852,475,6224,4555};
        reverseArray(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        bubblesort(marks);
        for(int i=0;i<marks.length-1;i++){
            System.out.println(marks[i]+"");
        }
        System.out.println();
        //  Arrays.sort(marks);
        //  for(int i=0;i<marks.length;i++){
            // System.out.print(marks[i]+ " ");
            // 
        //  }
          
        }



    
}
