import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    // LinkedList l = new LinkedList();
    // System.out.println(l); //empty list
    // l.add("one");
    // System.out.println(l); //should print "one-->"
    // l.add("two");
    // System.out.println(l); //should print "two-->one-->"
    // System.out.println(l.get(1)); //should print "one" 

    LinkedList l = new LinkedList();
    l.add("d"); //add always adds to the beginning 
    l.add("c"); 
    l.add("b"); 
    l.add("a"); 
    System.out.println(l);

    System.out.println(l.get(3));
    //System.out.println(l.get(5)); //throws a null pointer exception
    System.out.println("The size of the L.L is " + l.size());

    l.add(1, "z");
    System.out.println(l);
    l.add(3, "hello");
    System.out.println(l);
    l.add(0, "start");
    System.out.println(l);

    l.add(l.size(), "end"); //because "add" addss at the index, to add at the very end just use the size
    System.out.println(l);    

    System.out.println(l.indexOf("hello")); //test indexOf
    System.out.println(l.indexOf("adam")); //test for something not found

    //test toArray
    String[] tester = l.toArray();
    //copying over the print array code we wrote a long time ago.
    String arrayString = "["; //print opening bracket
    for (int i=0; i< tester.length; i++){ //loop through the array
      arrayString += tester[i]; //print the value at current index
      if (i < tester.length - 1){ //if we are NOT at the last item, add a comma and a space.
        arrayString += ", ";
      }
    }
    arrayString += "]"; 

    System.out.println(arrayString); 
  }
}
