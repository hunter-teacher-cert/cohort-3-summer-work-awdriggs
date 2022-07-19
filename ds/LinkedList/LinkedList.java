import java.io.*;
import java.util.*;

/**
  For all attempted methods, make sensible decisions for error and
  edge cases (such as indexing out of bounds).

  Basic
  -----
  add(string value)
  get(int index);
  toString()


  Intermediate (at least add, size + one of the other two)
  ------------
  size()
  add(int index,String value)
  indexOf(String value);
  toArray()


  Challenge
  --------
  remove(int index);
  */

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
Parameters:
value - the new string to add to the list

Adds a new node containing value to the front of the list.
*/
  public void add(String value){
    //REFER TO THE DIAGRAM

    //remember...
    //int x = 0;
    //x = x + 1; //showing that right hand evaluates first

    head = new Node(value, head); //creates a new node, assigns value and next node (right hand side), then points head to this new node (left hand assignment).
  }

  /**
    Returns the String in the node at location index.
    */
  public String get(int index){
    Node walker = head; //sets walker to the front

    for(int i = 0; i < index; i++){ //keep walking until we get to one less than the index
      walker = walker.getNext(); //will moves us to the index
    }
    //walker is at the index
    return walker.getData();
  }

  /**
    Return a string representation of the list
    */
  public String toString(){
    String lists = "";
    Node walker = head;
    //int x = 0; //with ints, we don't a new, because it is not an object
    //int y = x;

    //concatenate the data in all nodes
    while(walker != null){
      lists += walker;  //no need to use toString() - I wonder why
      walker = walker.getNext();
    }
    //return the final string
    return lists;
  }

  /**
    returns the number of elements in the list
    */
  public int size(){
    //create a counter
    Node walker = head;
    int counter = 0;
    //loop through the L.L. until null; //if walker is not equal to null, then add 1 to the counter
    while(walker != null){
      walker = walker.getNext();
      counter += 1;
    }
    //return counter
    return counter;
  }



  /**
Parameters:
index - an int with the location to add
value - the new value

Adds a new node with the String value to the list.
The new node should be added at the location specified by the index.

For example, given the list:
"a" -> "b" -> "c" -> "d"

add(1,"z") results in:
"a"-> "z" -> "b" -> "c" -> "d"

*/
  public void add(int index, String value){
    if(index == 0){
      add(value); //use the original add if index is 0
    } else { //if index is zero, just the other add method with value
      Node walker = head;
      Node nodeToAdd; //will get updated later on
      Node nodeBeforeWalker = walker;

      //loop until we get to the index value
      for(int i = 0; i < index; i++){
        nodeBeforeWalker = walker;//brilliant! this node will always point at walker before walker gets updated
        walker = walker.getNext();
        System.out.println("next walker");
      }
      //walker is at index - the below line is the PIVOTAL part of this method
      nodeToAdd = new Node(value, walker); //this is the new node to insert
                                           //point the node before the walker to the new node
      nodeBeforeWalker.setNext(nodeToAdd);
    }
  }


  /**
    Returns the index (location) of the first node in the list
    that contains value.

Example:
Given the list:
"a"->"b"->"c"->"d"->"e"
indexOf("d") would return 3 since "d" is at location 3.

*/
  public int indexOf(String value){
    //iterate through the L.L. with walker node
    //if the walker's data == value, then return the index of the walker
    Node walker = head;
    int index = 0; //keep track of the location of the walker

    //loop through the L.L. until null; //if walker is not equal to null, keep looking for the value.
    while(walker != null){ //walker.getData() != value will infinitely search for the data if not found - we don't want that
                           //check to see if walker's value matches the one we are looking for
      if(walker.getData() == value){
        return index;
      }

      index += 1; //update the index
      walker = walker.getNext(); //update walker to point to next value
    }

    //if we get to here it means the item wasn't found
    index = -1; //-1 indicates the item wasn't found

    return index; //send back the index
  }


  /**
    This routine should create a new array that is the same
    size as the number of Nodes in the list.

    It should then copy all of the values to the array and return
    the array.

*/
  public String[] toArray(){
    //create a walker node
    Node walker = head;
    //create a new array with the size of the L.L. size
    String[] copy = new String[size()];
    //System.out.println(copy.length); //just to test the size of the array
    //iterate through the L.L. and copy over the data in each node to the new array - for loop?
    for(int i = 0; i < size(); i++){
      copy[i] = walker.getData();
      walker = walker.getNext();
    }
    //return the String[]
    return copy;
  }

  //l.size();
  //this.size();
  //size();

  /**
    Remove the Node at location index from the list.

Ex:

Given the list:
"a"->"b"->"c"->"d"->"e"

remove(2) results in:
"a"->"b"->"d"->"e"
*/
  public void remove(int index){
    if(index == 0){ //special case, there is no before
      head = head.getNext();
    } else {
      Node walker = head; //start at the beginning
      Node nodeBeforeWalker = null;
      // move walker to the index
      for(int i = 0; i < index; i++){
        nodeBeforeWalker = walker; //update before
        walker = walker.getNext(); //update walker
      }
      //here, waker is at index
      //before node next should point to walker's next
      nodeBeforeWalker.setNext(walker.getNext());
    }
  }

}
