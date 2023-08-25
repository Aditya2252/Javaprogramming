public class tut15 {
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

public Node findmidd(Node head){
  Node slow=head;
  Node fast=head;
  while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
  }
  return slow;// slow is my middle node 
}

public boolean check(){
  if(head==null |head.next==null){
    return true;
  }
  //step 1 :find midd
  Node Middle=findmidd(head);
  //step 2 :reverse 2nd half

  Node prev=null;
  Node curr=Middle;
  Node next;
  while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
  }
  Node right=prev;
  Node left=head;

  while(right!=null){
    if(left.data!=right.data){
      return false;


    }
    left=left.next;
    right=right.next;

  }
  return true;

  
}

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
        ll.insert(1);
         ll.print();
         System.out.println(ll.check());
         
         
       

        
    }
    
}
