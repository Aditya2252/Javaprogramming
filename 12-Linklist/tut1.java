import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(){
        data=0;
        next=null;

    }
    public Node(int d,Node n){
        data=d;
        next=n;
    }
    public void setData(int d){
        data=d;

    }
    public void setNext(Node n){
        next=n;
    }
    public int  getData(){
        return (data);
    }
    public Node getnext(){
        return (next);
    }

}

class LinkedList{
    int size;
    Node start;

    public LinkedList(){
        size=0;
         start=null;
    }
    public void  insertFirst(int value){
        Node n=new Node();
        n.setData(value);
        n.setNext(start);
        size++;

 }

 public void insertlast(int value){
    Node n,t;
    n=new Node();
    n.setData(value);
    t=start;
    if(t==null){
        start=n;
    }else{
        while(t.getnext()!=null){
            t=t.getnext(); 
            t.setNext(n);
            size++;
        }
    }
}
public void insertposition(int value,int pos){
    if(pos==1){
        insertFirst(value);
        
    }
    else if(pos==size+1){
        insertlast(value);
    }
    else if(pos>1 && pos<size){
        Node n;
        n=new Node(value,null);
        Node t;
        t=start;
        for(int i=1;i<pos-1;i++){
            t=t.getnext();
            n.setNext(t.getnext());
            t.setNext(n);
            size++;


        }

    }else{
        System.out.println("Insertion are not possible");
    }
}

public void deleteFirst(){
    if(start==null){
        System.out.println("list are empty");
    }else{
        start=start.getnext();
        size--;
    }
}
public void deleteLast(){
    Node n;
    if(start==null){
        System.out.println("String are empty");

    }else if(size==1){
        start=null;
        size--;

    }else{
        Node t;
        t=start;
        for(int i=0;i<size-1;i++){
            t=t.getnext();
            t.setNext(null);
            size--;

        }

    }
}




    public boolean isEmpty(){
        if(start==null){
            return true;
        }else{
            return false;
        }
    }

    public int getListSize(){
        return(size);

    }

    public void viewList(){
        Node n;
        if(isEmpty()){
            System.out.println("Given list is empty");

        }else{
            n=start;
            for(int i=1;i<=size;i++){
                System.out.println(" "+n.getData());
                n=n.getnext();

            }
        }
    }

}



public class tut1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. Add item to list at start");
            System.out.println("2 Add item to list at last");
            System.out.println("3 Add item to list at position");
            System.out.println("4");
        }
        
    }

    
}