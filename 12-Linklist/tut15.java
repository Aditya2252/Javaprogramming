public class tut15 {
  public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;

    }
  }
  public static Node head = null;
  public static Node tail=null;

  public void insert(int data){

    Node newNode=new Node(data);
    // if(head==null){
        // head=tail=newNode;
    // }
    // newNode.next=;
    // head=newNode;

    if(head==null){
      head = tail=newNode;
      // newNode.next = null;
      // return;
    }

    Node temp = head;

    while(temp.next != null){
      temp = temp.next;
    }

    temp.next = newNode;
    newNode.next = null;
    tail=newNode;
    
   }

   public void insertlast(int data){
    Node newNode=new Node(data);
    if(head==null){
      head=tail=newNode;
    }
    tail.next=newNode;
    tail=newNode;

   }

   public void insertfirst(int data){
    Node newNode=new Node (data);
    if(head==null){
      head=tail=newNode;
    }
    newNode.next=head;
    head=newNode;
   }


  public void print(){
    Node temp=head;
    while(temp!=null){
      System.out.println(temp.data);
      temp=temp.next;

    }
  }


    public static void main(String[] args) {
        tut15 ll=new tut15();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);

        ll.insertlast(5);
        ll.insertfirst(0);
        ll.print();

        
    }
    
}
