import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

    System.out.println("Testing Stack");
    Stack s = new Stack(10);
    System.out.println(s);
    //System.out.println(s.top()); //to test for runtime error
    System.out.println("emtpy? " + s.isEmpty());
    System.out.println("full? " + s.isFull());
    //s.push(5);
    for(int i = 0; i < 7; i++){
      s.push(i*100);
    }
    
    System.out.println(s);
    System.out.println(s.size());
    System.out.println("emtpy? " + s.isEmpty());
    System.out.println("full? " + s.isFull());
    System.out.println("top: " + s.top());
    System.out.println("pop: " + s.pop()); //returns removed value
    System.out.println(s);

    System.out.println("Testing Queue");
    Queue q = new Queue();

    System.out.println("empty? " + q.isEmpty()); //should print the true;
                                     //test with some names
    q.enqueue("adam");
    q.enqueue("eric");
    q.enqueue("brent");
    q.enqueue("mom");
    q.enqueue("dad");

    System.out.println("empty? " + q.isEmpty()); //should print the true;
    System.out.println(q); //should print the queue
    System.out.println("empty? " + q.isEmpty()); //should print the true;
    System.out.println("size: " + q.size());
    
     
    System.out.println(q.dequeue()); //should print adam
    System.out.println(q); //should print the queue
    System.out.println("size: " + q.size());

    System.out.println("front " + q.front()); //should print eric 
    System.out.println(q); //should print the queue
    System.out.println("size: " + q.size());
  }
}
