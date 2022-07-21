import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	int size = 1000000;
	SortSearch ss = new SortSearch(size);
	//System.out.println(ss);
	
  long start,elapsed;

  System.out.println("Testing Linear Search");
	start = System.currentTimeMillis();
  System.out.println("start " + start);
  // ss.linearSearch(12);
  System.out.println(ss.linearSearch(12));
	elapsed = System.currentTimeMillis() - start;   
	System.out.println("Size: " + size + " Time: " + elapsed);

  System.out.println("Testing Sort");
  start = System.currentTimeMillis();
  System.out.println("start " + start);
	ss.sort();
  //System.out.println(ss);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time: " + elapsed);

  System.out.println("Testing Binary Search");
  start = System.currentTimeMillis();
  System.out.println("start " + start);
  // ss.binarySearch(12);
  System.out.println(ss.binarySearch(12));
	elapsed = System.currentTimeMillis() - start; //only the binary search time 
	System.out.println("Size: " + size + " Time: " + elapsed);

  System.out.println("Testing Recursive Binary Search");
  start = System.currentTimeMillis();
  System.out.println("start " + start);
  // ss.binarySearchRecursive(12, 0, size-1);
  System.out.println(ss.binarySearchRecursive(12, 0, size-1));
	elapsed = System.currentTimeMillis() - start; //only the recursive binary search time 
	System.out.println("Size: " + size + " Time: " + elapsed);

      
		
	// // Uncomment these to test part 2

	// int i;
	// i = ss.findSmallestIndex(0);
	// System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	// i = ss.findSmallestIndex(13);
	// System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);

 //  i = ss.findSmallestIndex(5);
	// System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// // Uncomment these to test part 3

	// System.out.println(ss);
	// ss.sort();
	// System.out.println(ss);

 //  System.out.println("Linear search:" + ss.linearSearch(4));
 //  System.out.println("Binary search:" + ss.binarySearch(4));
 //  System.out.println("Recursive binary search:" + ss.binarySearchRecursive(4, 0, 14));
      
	


	      

    }
}
