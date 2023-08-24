public class tut6 {
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(newNode==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }



    public static void main(String[] args) {
        tut6 ll =new tut6();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        
        
    }

}
    

