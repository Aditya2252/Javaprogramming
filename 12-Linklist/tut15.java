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

  public void insert(int data){

    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
    }
    newNode.next=head;
    head=newNode;

  }

  public void print(){
    
  }


    public static void main(String[] args) {
        tut15 ll=new tut15();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);

        
    }
    
}
