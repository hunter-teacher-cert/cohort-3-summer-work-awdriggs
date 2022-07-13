import java.io.*;
import java.util.*;

/** Methods to write

  Basic level:
  ------------
  public static ArrayList<Integer> buildRandomList(int size, int maxval)
  public static int sumOfList(ArrayList<Integer> dataList)

  Intermediate level:
  -------------------
  public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)

  Challenge level:
  -------------------
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
  */


public class AlPractice{

  /**
Parameters:
- size - an integer representing how many items to add to the list
- maxval - the largest value to store in the list
Preconditions:
- size >= 0
- maxVal > 0
Returns:
- A new ArrayList of Integers with each value being a random
number between 0 and maxval (not including maxval).
*/
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
    ArrayList<Integer> randomList = new ArrayList<Integer>(size);

    Random rand = new Random();

    for (int i = 0; i < size; i++){
      int newRandom = rand.nextInt(maxval); //create a new random number
      randomList.add(newRandom); //put the new number in our list
    }

    return randomList;//placeholder to compile.
  }

  /**
Parameters:
- dataList - an ArrayList of integer values.
Returns:
- The sum of all of the elements of the ArrayList.
*/
  public static int sumOfList(ArrayList<Integer> dataList){
    int sum = 0; //

    for(int i = 0; i < dataList.size(); i++){
      sum += dataList.get(i); //arrayList is an object so we should use a dot method
                              //same as `sum = sum + dataList.get(i);
    }
    return sum;//placeholder to compile.
  }

  /**
Parameters:
- dataList - an ArrayList of Integers
- index1, index2 - the two locations to swap.
Preconditions:
- index1 and index2 are valid indecies of dataList
Postconditions:
- The ArrayList is modified such that
The value that was in dataList[index1] is now in dataList[index2], and
the value  that was in dataList[index2] is now in dataList[index1].
- No other values should be modified.
*/
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){
    //index1 and index2 are valid indecies of dataList
    //dataList.size();
    if (index1 > dataList.size() || index2 > dataList.size()){
      System.out.println("Invalid index. ");
    } else{
      int temp = dataList.get(index1); //get the value at index 1
      dataList.set(index1, dataList.get(index2)); //get the value of
      dataList.set(index2, temp); //put temp at index2
    }
  }

  /**
Parameters:
- dataList - an AraryList of Integers
- valueToRemove - the value to remove
Postconditions:
- The dataList is modified such that all occurances of valueToRemove are removed.
*/
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
    //remove(object) will return true if an object has been removed.
    Integer intObj = new Integer(valueToRemove);
    // Integer.valueOf(valueToRemove)
    boolean keepGoing = true;

    while(keepGoing == true){
      keepGoing = dataList.remove(intObj);
      //update keepGoing;
    }
    // this won't get all the values
    // for(int i = 0; i < dataList.size(); i++){
    //   if(dataList.get(i) == valueToRemove){
    //     dataList.remove(i);//built in remove function
    //   }
    // }
  }


  /**
Parameters:
- ListA,ListB - ArrayLists of integer values.
Preconditions:
- ListA and ListB have equal lengths.
Returns:
- A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
Postconditions:
- The parameter ArrayLists should not be modified.
*/
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA, ArrayList<Integer>ListB){
    ArrayList<Integer> summed = new ArrayList<Integer>();

    if(ListA.size() != ListB.size()){
      System.out.println("Error! Lists aren't the same length");
    } else {
      for(int i = 0; i < ListA.size(); i++){
        summed.add(ListA.get(i) + ListB.get(i));
      }
    }
    return summed;//placeholder to compile.
  }

  /** zipLists
Parameters:
- ListA,ListB - ArrayLists of integer values.
Returns:
- A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
When one list has no more values to add, continue adding the remaining values of the longer list.
e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
Postconditions:
- The parameter ArrayLists should not be modified.
*/
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    ArrayList<Integer> zipped = new ArrayList<Integer>();
    //figure out which list is longer
    int maxIndex = ListA.size() >= ListB.size() ? ListA.size() : ListB.size();

    for(int i = 0; i < maxIndex; i++){
      if(i < ListA.size()){
        zipped.add(ListA.get(i));
      }

      if(i < ListB.size()){
        zipped.add(ListB.get(i));
      }
    }

    return zipped;//placeholder to compile.
  }

  public static void main(String[] args) {

    // ArrayList<Integer> al;

    // // Uncomment these to test buildRandomList
    // al = buildRandomList(10,100);
    // System.out.println(al);
    // System.out.println("size: " + al.size()); //should print 10

    // System.out.println("sum: " + sumOfList(al));
    // System.out.println("swap first for last value");
    // swapElements(al, 0, al.size()-1);
    // System.out.println(al);

    // Uncomment these to test swapElements
    // swapElements(2,6);
    //System.out.println(al);

    // Uncomment these to test removeValue
    // ArrayList<Integer> al = new ArrayList<Integer>(); //create a new array list of type integer using the default constructor.
    // al.add(5);
    // al.add(10);
    // al.add(5);
    // al.add(13);
    // al.set(2,5);

    // al.set(3,5);
    // System.out.println(al);
    // removeValue(al,5);
    // System.out.println(al);

    // Uncomment to test sumLists
    // sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
    // ArrayList<Integer> one = new ArrayList<Integer>(); //create a new array list of type integer using the default constructor.
    // ArrayList<Integer> two = new ArrayList<Integer>(); //create a new array list of type integer using the default constructor.
    // one.add(1);
    // one.add(2);
    // one.add(3);

    // two.add(4);
    // two.add(0);
    // two.add(5);

    // ArrayList<Integer> three = sumLists(one, two);
    // System.out.println(three);

    // Uncomment to test zipped
    // e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
    ArrayList<Integer> one = new ArrayList<Integer>(); //create a new array list of type integer using the default constructor.
    ArrayList<Integer> two = new ArrayList<Integer>(); //create a new array list of type integer using the default constructor.
    one.add(1);
    one.add(2);
    one.add(3);
    one.add(4);

    two.add(8);
    two.add(9);
    System.out.println(zipLists(one, two));
  }

}
