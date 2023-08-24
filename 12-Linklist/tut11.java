public class tut11 {
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
    public static int size;

    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
              
            }
            i++;
            temp = temp.next;
            
        }
        return i;
    }
    public int  searchII(int i){
        Node temp=head;
        for(int index=0;index<i;index++){
           if(index==i){
            return temp.data;
           }
           
            temp=temp.next;

        }
        return temp.data;
    }

    public void removeMiddle(int i) {
        Node temp = head;
        for (int index = 0; index < i - 1; index++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
        }
        if (size == 1) {
            head = tail = null;
        }
        head = head.next;
        size--;

    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
        }
        if (size == 1) {
            head = tail = null;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;

    }

    public void addMiddle(int data, int i) {
        Node temp = head;
        for (int index = 0; index < i - 1; index++) {
            temp = temp.next;

        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        size++;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        size++;
        // newNode.next=null;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        tut11 ll = new tut11();
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(9);
        ll.addLast(10);
        ll.addMiddle(5, 2);
        int rr=ll.searchII(3);
        System.out.println(rr);
        ll.print();
       // ll.removeFirst();
        //ll.removeLast();
        //ll.removeMiddle(2);
        // ll.print();
        // ll.reverse();
        // ll.print();

        // System.out.println("Size of linked list is :=" + size);
         int result = ll.search(8);
         System.out.println("result = " + result);


    }

}
