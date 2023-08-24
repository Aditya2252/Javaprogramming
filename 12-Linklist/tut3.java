public class tut3 {

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
     tut3.Node head=new tut3.Node(1);
     head.next=new tut3.Node(3);

     head.next.next=new tut3.Node(3);
     head.next.next.next=new tut3.Node(4);
     printlinkedlist(head);
        
    }

    public static void printlinkedlist(Node head){
        Node current=head;
        while(current !=null){
            System.out.println(current.data + "");
            current=current.next;
        }
    }
    
}
