public class tut5 {
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

    public static void main(String[] args) {
        tut5 ll = new tut5();
        ll.head = new Node(1);
        ll.addFirst(1);
        ll.addFirst(2);

    }

}
