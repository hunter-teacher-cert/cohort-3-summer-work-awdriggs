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


  private Random r;  // Random number generator


  public SortSearch(){
    data = new ArrayList<Integer>();
    r = new Random();
    for (int i=0;i<15;i++){
      data.add(r.nextInt(1000));
    }

  }

  public SortSearch(int size, boolean random){
    data = new ArrayList<Integer>();

    if(random){
      r = new Random();
      for (int i=0;i<size;i++){
        data.add(r.nextInt(1000));
      }
    } else {
      //build increasing arrayList
      for(int i = 0; i < size; i++){
        data.add(i * 2);
      }
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

     On the other hand, if start was 0, then the method would
     return 1 since the value 3 is in index 1 and that is the smallest.

*/

  public int findSmallestIndex(int start){
    if(start < 0 || start >= this.data.size()) {
      System.out.println("Index " + start + " is invalid.  Returning -1.");
      return -1;
    } else {
      int smallIndex = start;
      int smallValue = this.get(start);
      for(int i = smallIndex; i < this.data.size(); i++) {
        if(this.get(i) < smallValue) {
          smallIndex = i;
          smallValue = this.get(i);
        }
      }
      return smallIndex; // returns index of 1st time smallest is seen
    }
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
  public void sort(){
    int minIndex;
    int temp;

    for(int i = 0; i < this.data.size(); i++) {
      minIndex = this.findSmallestIndex(i); // found smallest

      // swap
      temp = this.get(i);
      this.data.set(i, this.get(minIndex));
      this.data.set(minIndex, temp);


      // different order of swap
      // temp = this.get(minIndex);
      // this.data.set(minIndex, this.get(i));
      // this.data.set(i, temp);
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
    int index = -1;
    for(int i = 0; i < this.data.size(); i++) {
      if(this.get(i) == value) {
        index = i;
        return index;
      }
    }
    return index;
  }

  /**
    Implement a binary search as specified by the comments

    This algorithm only works on sorted ArrayLists.
    */
  public int binarySearch(int value){
    // check that data is sorted.  If not, sort it first
    //this.builtinSort();

    // create assign variables  representing the high, low and middle indices
    int low = 0;
    int high = this.data.size()-1;
    int mid = (low + high)/2;

    // while we're not done:
    //   if the item is at data.get(middle), return middle
    //   otherwise, update high, low, and middle
    while(high >= low) {

      if(value == this.get(mid)) {
        return mid;
      } else if(value > this.get(mid)) { // check top half
        low = mid + 1;
        mid = (low + high) / 2;
        // high remains the same
      } else { // value < this.get(mid) <-- check bottom half
               // low remains the same
        high = mid;
        mid = (low + high) / 2;

      }

    }
    System.out.println("Value, " + value + ", not found.");
    return -1;  // if not found
  }

  /**
    Implement a RECURSIVE binary search as specified by the comments

    This algorithm only works on sorted ArrayLists.
    */

  public int binarySearchRecursive(int value, int lowIndex, int highIndex){
    final int NOT_FOUND = -1;

    int midIndex = (lowIndex + highIndex) / 2;

    if (lowIndex >=  highIndex) { // end here
      System.out.println("Value, " + value + ", not found.");
      return NOT_FOUND;
    } else if( this.get(midIndex) == value) { // target found
      return midIndex;
    } else if (value < this.get(midIndex)) {
      // value at mid index higher than target
      // we need to look at the lower half, so set highIndex to 1 below current middle
      highIndex = midIndex;
    } else {
      //if (value > this.get(midIndex) ) {
      // value at mid index lower than target
      // we need to look at the upper half, so set lowIndex to 1 above middle location
      lowIndex = midIndex + 1;

      }

    return binarySearchRecursive(value, lowIndex, highIndex);

    }


    public String toString(){
      return ""+data;
    };


    public void builtinSort(){
      Collections.sort(data);

    }



  }

