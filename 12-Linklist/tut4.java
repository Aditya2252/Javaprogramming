public class tut4 {
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

    public static void main(String[] args) {
        tut4 ll=new tut4();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        printlinkedlist(head);

        
    }

    public static void printlinkedlist(Node head){
        Node current=head;
        while (current!=null) {
            System.out.println(current.data+ " ");
            current=current.next;


            
        }

    }
    
}
