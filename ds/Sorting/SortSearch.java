//Collaborators: Usman Ahmed, Ed Hawkins, Adam Driggers, Moo Joon Park

import java.io.*;
import java.util.*;

/*
   Sort Project:
   Part 1:  (BASIC)
   1. Analyze the two constructors - try to figure out how they work.
   2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
   the behavior of the constructors.
   Part 2: (BASIC)
   1. Read the description of findSmallestIndex and complete the method.
   2. Uncomment the lines in SortProjectDriver to test.
   Part 3: (INTERMEDIATE)
   1. Complete the sort method - read comments for description
   2. Uncomment the lines in sortProjectDriver to test.
   Search Project:
   1. Complete the linear search (BASIC)
   2. Complete the binary search (Intermediate)
   3. Complete the recursive version of binary search (Advanced)
   */

public class SortSearch{
  /* Sort project starts here */

  /* Instance Variables */
  private ArrayList<Integer> data;  // to store the data

  private Random r;


  public SortSearch(){
    data = new ArrayList<Integer>();
    r = new Random();
    for (int i=0;i<15;i++){
      data.add(r.nextInt(20));
    }
  }

  public SortSearch(int size){
    data = new ArrayList<Integer>();
    r = new Random();
    for (int i=0;i<size;i++){
      data.add(r.nextInt(20));
    }
  }

  /* Convenience function to get data out of the ArrayList from the driver */
  public int get(int index){
    return this.data.get(index);
  }

  /*
     return the index of the smallest data idem from index start to the end
     of the ArrayList. If there are multiple of the smallest value,
     return any of them.

     Example, if the arraylist has:
     5,3,10,6,8
     if start was 2 (start at index 2, value 10) then it would return 3
     which is the index of the value 6 which is the index with the
     smallest value from start to end
     On the otherh and, if start was 0, then the method would
     return 1 since the value 3 is in index 1 and that is the smallest.

*/
  public int findSmallestIndex(int start)
  {
    int smallIndex = start;

    for( int i = start; i < data.size(); i++)
    {
      if (data.get(i) < data.get(smallIndex))
      {
        smallIndex = i;
      }
    }
    return smallIndex;
  }

  /**
    Implement the selection sort algorithm by sorting the ArrayList
    data in place.
Algorithm:
Loop a variable that represents the ArrayList index from
0 to the end of the ArrayList.
For each index, find the smallest from that Location
to the end of the array and swap it with that index.
*/
  public void sort()
  {
    int temp;
    for(int i = 0; i < data.size() - 1; i++)
    {
      int smallIndex = findSmallestIndex(i); //returns smallest index from i to the end
                                             //give temp the data at i
      temp = data.get(i);
      //give data at i the data of the smallest index
      data.set(i, data.get(smallIndex));
      //give data the value at smallest index
      data.set(smallIndex, temp);
    }
  }

  /* Search project starts here */

  /**
    performs a linear search. Returns the index of the first occurence of
    value in the ArrayList data or -1 if not found.
    This works by starting at the first element and searching one element at a time
    until either the element is found or you've looked at all the elements.
    This algorithm works on any ArrayList.
    */
  public int linearSearch(int value){
    //go through the array list
    for(int i =0; i < data.size()-1; i++){
      if(data.get(i)== value){
        return i; //this will stop the search at the first occurence.
      }
    }
    return -1; // replace this return
  }

  /**
    Implement a binary search as specified by the comments

    This algorithm only works on sorted ArrayLists.
    */
  public int binarySearch(int value){

    // create assign variables  representing the high, low and middle indices
    int high = data.size()-1;
    int low = 0;
    int middle = (high + low)/2;

    // while we're not done:
    //check for a cross in high and low
    //ex [1, 3, 5], search for 2
    while(!(low > high)){ //low is not greater than high
      //System.out.println("low: " + low + " middle: "+ middle + " high: " + high);
      //   if the item is at data.get(middle), return middle
      if(data.get(middle) == value){
        return middle;
      } else {
        //   otherwise, update high, low, and middle
        if(data.get(middle) > value){
          //if middle is greater than value, search lower half
          high = middle - 1;
          middle = (high + low)/2;
          //low stays the same.
        } else {
          //if middle is less than value, search upper half
          low = middle + 1;
          middle = (high + low)/2;
        }
      }
    }
    return -1; //item not found
  }

  /**
    Implement a RECURSIVE binary search as specified by the comments

    This algorithm only works on sorted ArrayLists.
    */
  public int binarySearchRecursive(int value, int lowIndex, int highIndex){
    //won't return the first occurence if the number in the middle matches the case the first time.
    int midIndex = (lowIndex + highIndex) / 2; //init tracker var for middle position
                                               //exit case. If lo & hi have crossed, target not present
    if (lowIndex > highIndex){
      return -1;
    } else {
      //target
      int targetIndex = -1;
      if (data.get(midIndex) == value) {  // target found
        targetIndex = midIndex;
        // binarySearchRecursive(value, lowIndex, midIndex-1); //see if there is a lpower index!
      }
      // value at mid index higher than target
      else if (data.get(midIndex) > value) {
        // low should stay the same.
        // high position should be the middle
        return binarySearchRecursive(value, lowIndex, midIndex-1);
      }
      // value at mid index lower than target
      else  {
        //new low position should be middle position
        //high should stay the same.
        return binarySearchRecursive(value, midIndex+1, highIndex);
      }
      return targetIndex;
    }

  }

  public String toString(){
    return ""+data;
  };

  public void builtinSort(){
    Collections.sort(data);
  }
}
