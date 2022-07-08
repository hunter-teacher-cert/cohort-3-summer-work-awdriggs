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
  // Instance Variable(s)
  // You can change this if you want to use the alternate
  // implementation of just storing the overall seconds.
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
  public Time(int hrs, int mins, int secs){
    seconds = hours * 3600 + minutes * 60 + seconds;
  }


  // Methods

  /**
    returns a string representation of the time
    */
  public String toString(){
    // return(String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds)); //better version?
    // return String.format("%02d", seconds % 3600) + ":" + String.format("%02d", seconds % 60) + ":" + String.format("%02d", seconds % 3600);
    int hours = seconds % 60
  }
   




  /**
Parameters:
- hrs,mins,secs - ints representing a time

modifies this instance to represent the time hrs:mins:secs
*/
  public void set(int hrs, int mins, int secs){
    // add the code to add the time represented by other
    // to this instance.
    hours = hrs; //needed this?
    minutes = mins;
    seconds = seconds;
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

    // add seconds, if seconds > 59, sec = remainder of mod 60, add 1 to hrsU
    // add mintues, if minutes > 59, min = remainder of mod 60, add 1 to hrsU
    // add hours, if hours > 23, hrs = remainder of mod 24
    

  }


  /**
Parameters:
other - a variable of type Time

Returns:
True if this instance and other represents the same time
false otherwise.
*/
  public boolean equals(Time other){
    // your code here)
    boolean hrs = hours == other.hours;
    boolean min = minutes == other.minutes;
    boolean sec = seconds == other.seconds;

    if(hrs && min && sec){
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
    // your code here)
    //convert the times to a single value 
    // double thisTime//hrs + min/60 + seconds/3600
    
    return 0; // change this
  }

  public int setValue(){

    return hours * 3600 + minutes * 60 + seconds; 

  }

}//end class
