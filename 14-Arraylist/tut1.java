import java.util.*;

class tut1{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        // to prefrom a add operation on arraylist

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // to perform operation on get elements

        int elements=  list.get(0);
        int elements2=list.get(1);
        System.out.println(elements+elements2);

        // to perform operation in between arraylist

        list.add(1,1);
        list.add(2,10);

        System.out.println(list);

        // to perform set operation on arraylist to set element on particular location

        list.set(1,12);
        list.set(2,13);
        System.out.println(list);

        // to perform operation delete operation on arraylist

        list.remove(2);
        System.out.println(list);

        // to claculate size of arraylist we can do following operations

        int size=list.size();
        System.out.println(size);


        // iterate the arraylist using for loop

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();


        // for sorting in arraylist

        Collections.sort(list);
        System.out.println(list);





        
    }
}