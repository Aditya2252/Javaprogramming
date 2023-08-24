/**
 * tut9
 */
public class tut9 {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;


    public void addfirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        
        newNode.next=head;
        head=newNode;
    }

    public  void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
    
        }
        tail.next=newNode;
        tail=newNode;
    }

   public void addMiddle(int data,int i){
    Node temp=head;
    // int index=0;
    for(int index=0;index<i-1;index++){
        temp=temp.next;

    }
    Node newNode=new Node(data);
    newNode.next=temp.next;
    temp.next=newNode;
   }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }



    public static void main(String[] args) {
        tut9 ll=new tut9();
        ll.addfirst(1);
        ll.addfirst(2);
        
         ll.addLast(4);
         ll.addLast(5);
        ll.addMiddle(3, 3);
        ll.print();

        
    }
}