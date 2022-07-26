//Collaborators: Usman Ahmed, Ed Hawkins, Adam Riggers, Moo Joon Park

import java.io.*;
import java.util.*;

public class SortSearchDriver {
  public static void main(String[] args) {


    // Uncomment these to test part 1

    // SortSearch ss = new SortSearch(20);
    //System.out.println(ss);
    // ss = new SortSearch(); //testing undefined length
    //System.out.println(ss);


    // Uncomment these to test part 2

    // int i;
    // i = ss.findSmallestIndex(0);
    // System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

    // i = ss.findSmallestIndex(3);
    // System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);

    // Uncomment these to test part 3

    // System.out.println(ss);
    // ss.sort();
    // System.out.println(ss);

    // System.out.println("testing linear search");
    // System.out.println(ss.linearSearch(10));
    // System.out.println(ss.linearSearch(19)); //should print 7
    // System.out.println(ss.linearSearch(13));

    // System.out.println(ss.binarySearch(10));
    // System.out.println(ss.binarySearchRecursive(10, 0, 20));

    // testing merge sort
    // SortSearch ss = new SortSearch();  // new ss, don't care about what is in it right now
    // ArrayList<Integer> a = ss.buildIncreasingList(10);
    // System.out.println(a);
    // // build a second Arralist here
    // ArrayList<Integer> b = ss.buildIncreasingList(6);
    // System.out.println(b);


    // // test your merge routine here
    // ArrayList<Integer> sorted = ss.merge(a, b);
    // System.out.println(sorted);

    //merge sort!
    int size = 10;
    SortSearch ss = new SortSearch(size);
    System.out.println(ss); //prints unsorted array
    ss.msort(); //does the merge sort of this array.
    System.out.println(ss); //prints array after it is sorted
  }
}
