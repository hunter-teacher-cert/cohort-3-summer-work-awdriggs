// Recall, a queue is a First In First Out structure.
import java.util.*;

// You should implement the following methods

// A constructor with no parameters
// void enqueue(int value) - add value to the end of the queue
// int dequeue() - remove and return the top value from front of the queue
// int front() - return but do not remove the top value from the front of the queue
// boolean isEmpty() - return true of the queue is empty, false otherwise
// int size() - return the number of elements currently in the queue
// boolean isFull() - returns true if the queue is full, false otherwise - only implement this if you use an array for implementation

public class Queue{

  // Place private instance variables here
  LinkedList<String> queue; //using built-in LinkedList
                                    //queue will be a linked list since we don't care how long it is.
                                    // Place constructors here
  public Queue(){
    queue = new LinkedList<String>();
  }
  // Place methods here
  public void enqueue(String value){
    queue.add(value);
  }

  public String dequeue() {
    return queue.removeFirst();
  }

  public String front(){
    return queue.peekFirst();
  }

  public boolean isEmpty(){
   if(queue.size() == 0){
     return true;
   } else {
     return false;
   }
  }

  public int size() {
    return queue.size();
  }

  public String toString(){
    return queue.toString();
  }
}

//addFirst()	Adds an item to the beginning of the list.	
//removeFirst() removes the first element
//peekFirst() //return but don't remeove
//pollFirst() //remove and return first element 
