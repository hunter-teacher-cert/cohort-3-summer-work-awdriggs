import java.io.*;
import java.util.*;

public class Methods {
	//ex 2, 3 and 8
  public static boolean isDivisible(int n, int m){
    if(n%m == 0){
      return true;
    } else {
      return false;
    }
  }

  public static boolean isTriangle(int a, int b, int c){
    if(a > b + c){
      return false;
    } else if(b > c + a){
      return false;
    } else if(c > a + b){
      return false;
    } else return true;
  }

  public static int ack(int m, int n){
    if(m == 0){
      return n + 1;
    } else if(m > 0 && n == 0){
      return ack(m - 1, 1);
    } else if(m > 0 && n > 0){
      return ack(m - 1 , ack(m, n - 1));
    } else return n + 1;
  }
  
  public static void main(String[] args){
    //tests for ex 2
    //System.out.println(isDivisible(4,2));
    //System.out.println(isDivisible(6,4));

    //tests for ex 3
    // System.out.println(isTriangle(12, 2, 2));
    // System.out.println(isTriangle(2, 12, 2));
    // System.out.println(isTriangle(2, 2, 12));
    // System.out.println(isTriangle(4,5,6));

    System.out.println("2 and 0: " + ack(2,0));
    System.out.println("1 and 1: " + ack(1,1));
    System.out.println("0 and 1: " + ack(0,1)); //returns 2
    System.out.println("3 and 3: " + ack(3,3));
    //System.out.println("3 and 3: " + ack(4,2)); //stack overflow
  }
}

  
    
