import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
INSTRUCTIONS:

This file contains the starter code for our Time class.

The class here uses ints for hours, minutes, and seconds but you
could decide to change the internal representation to just store
an int representing a number of seconds.

Place this file in a folder named programming/5/Time.java

Basic level (complete all):
- public Time(int hrs, int mins, int secs) - constructor
- public void toString()
- public void set(int hrs, int mins, int secs)

Intermediate level (complete Basic methods plus this method):
- public void add(Time other)
- public boolean isEquals(Time other)


Advanced level (complete Basic + Intermediate + these two methods):
- public int compareTo(Time other)

*/



public class Time {

  int seconds; //number of seconds
               // default constructor
  public Time(){
    seconds = 0;
  }

  /**
Parameters:
- hrs, mins, secs - the time you want to create the class as

Initialize this instance to represent hrs:mins:secs as the time.

*/
  public Time(int hrs, int mins, int sec){
    seconds = hrs * 3600 + mins * 60 + sec;
  }

  // Methods

  /**
    returns a string representation of the time
    */
  public String toString(){
    //need to convert back to hr:min:sec for printing
    int hrs = seconds / 3600;
    int min = seconds % 3600 / 60;
    int sec = seconds % 3600 % 60;

    return(String.format("%02d:%02d:%02d", hrs, min, sec)); 

  }





  /**
Parameters:
- hrs,mins,secs - ints representing a time

modifies this instance to represent the time hrs:mins:secs
*/
  public void set(int hrs, int mins, int sec){
    seconds = hrs * 3600 + mins * 60 + sec;
  }

  /**
Parameters:
- other - a variable of type Time

modifies this instance to represent the result of adding it and
the time other.
*/
  public void add(Time other){
    // add the code to add the time represented by other
    // to this instance.
    seconds += other.seconds;
    //check if you have passed a day
    int day = 86400; //seconds in a day
    if(seconds > day){ 
      seconds = seconds % day; //how many seconds are left over in the new day 
    }
  }

  /**
Parameters:
other - a variable of type Time

Returns:
True if this instance and other represents the same time
false otherwise.
*/
  public boolean equals(Time other){

    if(seconds == other.seconds){
      return true;
    } else {
      return false; // change this
    }
  }

  /**
Parameters:
other - a variable of type Time

Returns:
A positive number if this instance represents a time greater
than the time of other (this > other)

A negative number if this instance represents a time less
than the time of other (this < other)

0 if the two instances represent the same time.

*/
  public int compareTo(Time other){
    return seconds - other.seconds; //+ if this > other, - if not, bonus returns the difference 
  }

}//end class
