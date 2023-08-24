public class tut8 {
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
          
public static void addFirst(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
    }
    newNode.next=head;
    head=newNode;
}

public static void addLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;

    }
    tail.next=newNode;
    tail=newNode;
}

public void print(){
    if(head==null){
        System.out.println("LinkedList is empty");
    }
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
    System.out.println("null");
}

public void add(int i,int data){
    if(i==0){
        addFirst(data);
        return;

    }
    
    Node temp=head;
    // int index=0;
    for(int index=0;index<i-1;index++){
        
        temp=temp.next;
    }
    Node newNode=new Node(data);
    newNode.next=temp.next;
    temp.next=newNode;

}
    public static void main(String[] args) {
        tut8 ll=new tut8();
        ll.addFirst(5);
        
        ll.addFirst(6);
        
        ll.addLast(10);
      
        ll.addLast(11);

        ll.add(2, 4);
        ll.print();
        
        
    }
    
}
