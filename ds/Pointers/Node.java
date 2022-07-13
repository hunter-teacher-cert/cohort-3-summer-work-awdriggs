public class Node{
  // private String data;
  private int data;
  private Node next;


  /* Constructors */

  public Node(){

  }

  public Node(int data){
    this.data = data;
    this.next = null;

  }


  public Node(int data, Node next){
    this.data = data;
    this.next = next;
  }

  public int getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }

  public void setData(int data){
    this.data = data;
  }

  public void setNext(Node next){
    this.next = next;
  }

  public String toString(){

    if(this.next != null){
      return "" + data + "-> " + this.next; //accidental recursion?
    } else {
      return "" + data + "-> null ";
    }

  }
}
