import java.io.*;
import java.util.*;

public class Max {
  public static int indexOfMax(double[] a){
    int index = -1;
    double maxSoFar = 0.0;
    
    for(int i = 0; i < a.length; i++){
      if(a[i] > maxSoFar){
        index = i;
      }
    }
    return index;
  }
  public static void main(String[] args){
    double[] testArray = {0.5, 0.4, 0.2, 0.9, 0.6};
    System.out.println(indexOfMax(testArray));
  }
}