public class tut10 {

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
        public static int size;

        public void addfirst(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
            }
            newNode.next=head;
            head=newNode;



        }

        public void addlast(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;


        }

        public void addMiddle(int data,int i){
            if(i==0){
                addfirst(data);
            }
            Node temp=head;
            for(int index=0;index<i-1;index++){
                temp=temp.next;

            }
            Node newNode=new Node(data);
            size++;
            newNode.next=temp.next;
            temp.next=newNode;


        }

        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;

            }
        }
        public void removeFirst(){
            //int value=head.data;
            if(size==0){
                System.out.println("LinkedList are empty");
                size=0;
            }
            if(size==1){
                head=tail=null;
               size=0;
            }
            head=head.next;
            size--;
        }

        public void deleteLast(){
            if(size==0){
                System.out.println("Linked List is empty");
            }
            if(size==1){
                head=tail=null;

            }
            Node temp=head;

           for(int i=0;i<size-2;i++){
            temp=temp.next;

           }
           temp.next=null;
           tail=temp;
           size--;


        }

        public void removeMiddle(int i){
            Node temp=head;
            for(int index=0;index<i-1;index++){
                temp=temp.next;

            }
            temp.next=temp.next.next;
            size--;


        }

    
    public static void main(String[] args) {
        tut10 ll=new tut10();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addMiddle(3, 2);
        ll.removeFirst();
        ll.deleteLast();
        ll.removeMiddle(2);
        ll.print();
        System.out.print("Size of linkedlist "+ll.size+"");

         
        
    }
    
}
