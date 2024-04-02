class LL{
  class Node{
    String data;
    Node next;

    Node(String data){
      this.data=data;
      this.next=null;
    }
  }

  public static void main(String[] args){
    LL list = new LL();
    
  }

  public void addFirst(String data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
  }
}
