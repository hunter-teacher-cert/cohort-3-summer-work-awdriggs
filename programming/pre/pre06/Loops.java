import java.io.*;
import java.util.*;

public class Loops {
	//chapter 7
  //ex 2
 //(x0 + a/x0)/2 = 3.75
 
  
  public static double squareRoot(double a){
    double x = a/2;
    double prevX;
    int flag = 0; //flag to stop while loop
    
    do {
      prevX = x;
      x = (x + a / x) / 2; //guess at the square root
      
      if(Math.abs(prevX - x) < 0.0001){
        flag++;
      }
    } while (flag < 2);

    return x;
  }
  
  //ex 3
  public static double power(double x, int n){
    double result = 1;
    for(int i = 0; i < n; i++){
      result *= x;
    }
    return result;
  }

  public static int factorial(int f){
    int accumulator = 1; //since !0 = 1
    
    for(int i = 1; i <= f; i++){
      accumulator *= i; 
    }

    return accumulator;
  }

  //ex 4
  public static void main(String[] args){
    //testing ex2
    //System.out.println(squareRoot(9));
    //System.out.pirntln(squareRoot(27));
    
    //testing ex3
    //System.out.println(power(2,2));
    //System.out.println(power(4,4));

    //testing ex4
    System.out.println(factorial(3));
    System.out.println(factorial(10));
  }
}

  
    
