/**
 * ArrayPractice by Team 11
 * Adam Driggers
 * collaborators: Alana Robinson, Yenmin Young, Erwin Lara
 */

import java.util.*;
import java.io.*;

public class ArrayPractice{

  /**
Parameters:
size - how large the array should be
startValue - the value of the first element
step - the interval to the next value
Returns:
a new array of integers
Examples:
buildIncreasingArray(5,3,2) will return an array
with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
*/

  // [3, 5, 7, 9, 11]
  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];

    for (int i=0; i<size; i++){
      data[i] = startValue + i*step;
    }
    // assign the appropriate value to each one.
    return data;
  }


  /**
Parameters:
size - how many elements in the array
maxValue - the largest possible random value to use
Returns:
a new array where each element is an integer between 0
and up to but not including maxValue
*/

  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];


    for (int i = 0; i<size; i++){
      data[i] = r.nextInt(maxValue);
    }

    return data;
  }


  /**
Parameters:
data - an array of ints
Returns:
nothing
prints out the array
Note: data.length stores the length of the array
Another Note: yes, we know William live coded this a few minutes ago.
*/
  public static void printArray( int[] data )
  { //print out the contents of the array in standard format --> [item, item...]
    System.out.print("["); //print opening bracket
    for (int i=0; i<data.length; i++){ //loop through the array
      System.out.print(data[i]); //print the value at current index
      if (i < data.length - 1){ //if we are NOT at the last item, add a comma and a space.
        System.out.print(", ");
      }
    }
    System.out.print("]"); //closing bracket
    System.out.println(""); //end the line!
  }



  /**
Parameters:
data - an array of integers
value - the value to search for
Returns:
the index (location) of the first occurence of value
Example:
given array data, containing 1,5,2,7,5,8,5,12,19,5
firstOccurence(data,5) would return 1
since the first occurence of the value 5 is at a[1]
*/
  public static int firstOccurence( int[] data, int value )
  {
    int location = 0;
    boolean found = false;
    for (int i = 0; i<data.length; i++){
      if(data[i] == value){
        location = i;
        found = true;
        break;
      }
    }
    if (found == true){
      return location; // change this
    } else {
      return -1;
    }
  }


  /**
Parameters: data - an array of ints
Returns: an integer that is equal to the sum of all the elements in the array
Ex: If the input array has the values 5,2,4,10 the return
value will be 21 (5+2+4+10)
*/

  // [9, 4, 3, 2, 5, 0, 3, 9, 0, 3]
  public static int arraySum( int[] data ){
    int sum = 0;
    for(int i = 0; i<data.length; i++){
      //add each item to the sum
      sum = sum + data[i];
    }

    return sum;
  }


  /**
Parameters:
data - an array of integers
Returns:
true if the array is sorted, false otherwise
That is, if each element is < the element to its right
then the array is sorted.
An array with values 5,6,10,15 is sorted
An array with values 5,6,10,18,15 is not
*/
  public static boolean isSorted( int[] data )
  {
    for(int i = 0; i < data.length-1; i++){
      //look to see if value at i is greater than the previous value...
      //if so it is sorted
      //else it isn't. set sorted to false
      if (data[i] > data[i+1]){
        return false; //stop checking if you found a mistake
      }
    }

    return true; //if you made it this far it means that the array is sorted so return true;
  }

  /**
Parameters:
data - an array of integers
Returns:
value of the largest element in the array
*/
  public static int findMaxValue( int[] data ) {
    int m=0;  // will hold the maximum value;
    for (int i = 0; i<data.length; i++){
      if (data[i]>m){
        m = data[i];
      }
    }

    return m;
  }


  /**
Parameters:
data - an array of integers
Returns:
the number of odd elements in the array
Ex: if data holds 5,6,7,8,9,10 then the return value
will be 3 since three of the elements are odd.
*/
  public static int countOdds( int[] data ) {
    int count=0;

    for(int i = 0; i < data.length; i++){
      if(data[i] % 2 != 0){ //odd is not even
        count++;   
      }
    }
    // Note the % operator is the modulo (basically remainder) function
    // in java. Use to determine if an integer is odd.

    return count;
  }

  /**
Parameters:
data - an array of integers
Returns:
no return value since this is a void function -- but
you will manipulate the values in the array parameter
Postcondition:
elements of the input array are in reverse order
Example:
If the input array contains 5,8,13,7,27,2
After the routine, the array will contain 2,27,7,13,8,5
*/

  public static void flip( int[] data )
  {
    int[] flop = new int[data.length]; //new array the same length as data
                                       //build the flopped array
    for(int i = data.length - 1; i >= 0; i--){ //go backwards through the data array
                                               //add data at i to the inverse value of flop... how?
      int flopIndex = data.length - (1 + i); //length - length = 0, so first item
      flop[flopIndex] = data[i];
    }

    //data = flop; //this would be nice but doesnt work,java is pass by value! so...
    for(int i = 0; i <  data.length; i++){
      data[i] = flop[i];
    }
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.
  
    System.out.println("testing build random array");
    int[] testArray = buildRandomArray(10, 20);
    printArray(testArray);

    System.out.println("sum of the array: " + arraySum(testArray));
    
    System.out.println("first occurance of 4: " + firstOccurence(testArray, 4));
    System.out.println("max value in the array: " + findMaxValue(testArray));

    System.out.println("testing build increasing array");
    testArray = buildIncreasingArray(10,5,3);
    printArray(testArray);

    System.out.println("testing odd count");
    testArray = new int[]{5,6,7,8,9,10};
    printArray(testArray);
    System.out.println("number of odds " + countOdds(testArray));

    System.out.println("testing flop");
    testArray = new int[]{7, 8, 6, 3, 14};
    printArray(testArray);
    flip(testArray);
    printArray(testArray);
  }
}
