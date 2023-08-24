public class tut14 {
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

    public void deleteToend(int i){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(i==size){
            head=head.next;
            return;

        }
        Node tempe=head;
        for(int index=1;index<size-i;index++){
            tempe=tempe.next;

        }
        tempe.next=tempe.next.next;
        return;
    }
      
 
 
 


    public int  search(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
            
        }
        return -1;

    }

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

    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }



    public static void main(String[] args) {
        tut14 ll=new tut14();
        ll.insert(5);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);
        // ll.print();
        ll.deleteToend(2);
        ll.print();
        // ll.reverse();
        // ll.print();

        // int result=ll.search(5);
        // System.out.println(ll.search(5));


    }
    
}
