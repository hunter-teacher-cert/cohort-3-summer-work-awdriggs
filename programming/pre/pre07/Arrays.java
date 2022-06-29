import java.io.*;
import java.util.*;
//import java.util.Arrays;

public class Arrays {
  public static double[] powArray(double [] a, double pow){  
    double[] raised = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      raised[i] = Math.pow(a[i], pow);
      // System.out.println(a[i] + " --> " + raised[i]);
    }
    return raised;
  }

  public static int[] histogram(int[] scores, int counter){
    int[] counts = new int[counter];
     for(int i = 0; i < scores.length; i++) {
      int index = scores[i];
      counts[index]++;
    }
    return counts;
  }

  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    }
    return a; 
  }
  
  public static void main(String[] args){
    //double[] test = {1.0, 2.0, 3.0, 4.0};
    //powArray(test, 2);

    int[] scores = randomArray(30);
    int[] histo = histogram(scores, 100);
  }
}