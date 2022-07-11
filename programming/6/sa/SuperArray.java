/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators: First Last, First Last
 */

/**
  SKELETON
  SuperArray is a wrapper class for an array.

  Provides "pass-thru" accessibility to pre-existing array capabilities:
  - get/set by index
  - get length

  Adds functionality:
  - dynamic capacity
  - auto-grow capacity if necessary
  */

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
SUBGOAL:
declare instance vars
...and initialize?
*/


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    data = new int[size];
    //init instance vars
    numberElements = 0;
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
    data = new int[10];
    //init instance vars
    numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    /**
IMPORTANT:
This is the first code that should run in this method
but the last code you should write.
Implement the rest of this method first,
then only write this section once the rest is tested and working.
*/
    /* YOUR SIMPLE+SMART CODE HERE */

    // add item
    if(numberElements <= data.length - 1){ //length or length -1
      data[numberElements] = value;
      numberElements++; // increment numberElements
    } else {
      grow();
      add(value); //simple recursion, data should be bigger now
    }
  }//end add()


  public boolean isEmpty()
  {
    //@tofr response... return numberElements == 0; //even better!
    //return whether this SuperArray instance is empty
    return numberElements == 0 ? true : false;
    //@tofr response... return numberElements == 0; //even better!
  }


  public int get(int index)
  {
    return data[index]; //return item at index
  }

  public String toString()
  {
    //return stringified version of this array
    String arrayString = "["; //print opening bracket
    for (int i=0; i< numberElements; i++){ //loop through the array
      arrayString += data[i]; //print the value at current index
      if (i < numberElements - 1){ //if we are NOT at the last item, add a comma and a space.
        arrayString += ", ";
      }
    }
    arrayString += "]"; //closing bracket

    return arrayString;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    for(int i = index; i < numberElements; i++){
      data[i] = data[i+1]; // shift items down to remove the item at index
    }
     
    data[numberElements] = 0; //make the last one a zero for safety
    numberElements--; // subtract fom numElements;
  }


  public void add(int index, int value)
  {
    
    // see if there's enough room
    if(numberElements <= data.length - 1){ //length or length -1
      // data[numberElements] = value;
      // int[] temp = new int[numberElements - index]; //hold on to elements from index to end of array
      //for(int i = //loop through th 
      for(int i = numberElements; i > index; i--){
        data[i] = data[i-1]; // shift elements toward the end of the array
      }
      data[index] = value; // insert new element
      numberElements++; // increment numberElements
    } else {
      grow();
      add(index, value); //simple recursion, data should be bigger now
    }


    /* YOUR SIMPLE+SMART CODE HERE */


  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    // A: 1.5 times bigger, this is what ArrayList does
    int size = data.length + data.length/2;
    int[] newArray = new int[size];
    // copy over all the elements from the old array to the new one
    for(int i = 0; i < data.length; i++){
      newArray[i] = data[i];
    }

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    data = newArray; //reference v. value?
  }//end grow()

}//end class
