public class tut7 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // step 1: create a new node
        Node newNode = new Node(data);

        if (head == null) {

            head = tail = newNode;
            return;
        }

        // step 2: NewNode next=head
        newNode.next = head;

        // step 3: head=NewNode
        head = newNode;

    }
    public void addLast(int data){
        // step:=create a new node 
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return; 
        }
        // step:=tail.next=nenode;
        tail.next=newNode;
        //step tail=newNode
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

    public static void main(String[] args) {
        tut7 ll = new tut7();
        // ll.head = new Node(1);
        ll.addFirst(1);
        ll.print();

        ll.addFirst(2);
        ll.print();
        ll.addLast(10);
        ll.print();

    }

}
