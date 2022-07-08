import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
INSTRUCTIONS:

This file contains the Driver starter code for our Time class.

Add code in main to test all your methods

Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

  public static void main(String[] args) {

    //declare a var of appropriate type to assign an instance of Time to
    Time t;
    Time o;

    //assign var the address of a newly-apportioned Time object
    t = new Time(23, 5, 0);
    o = new Time(2, 6, 10);

    System.out.println("time: " + t.toString());
    System.out.println("other: " + o.toString());
    
   // o.set(1, 5, 0);
    System.out.println("equal? " + t.equals(o));
    
    System.out.println("compare: " + t.compareTo(o));

    t.add(o);
    System.out.println(t);

  }//end main()

}//end class
