import java.io.*;
import java.util.*;
import java.lang.Math;

public class Sieve {
// Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.
  public static boolean[] sieve(int n){
    boolean[] primes = new boolean[n-1]; //1 is neither prime or not prime, starting at 2 so take one of the length
    
    for(int i = 0; i < primes.length; i++){ 
      primes[i] = true; //set all to true to start
    }

    for(int i = 2; i < Math.sqrt(primes.length); i++){ //effiency, only have to count up to the square root of n
      for(int j = 2; (i*j) <= n; j++){ //start at 2 so i * 2, i * 3
        //debug
        //System.out.print("i:" + i + " j:" + j);
        //System.out.print(" " + (i * j) + "\n");

        primes[i*j - 2] = false; //since we are starting at 2, and arrays start at 0, take away 2
      }
    }
    
    return primes;
  }
  
  public static void main(String[] args){
    boolean[] primeList = sieve(100);

    //testing
    for(int i = 0; i < primeList.length; i++){
     //System.out.println(primeList[i]);
      if(primeList[i]==true){
        System.out.println((i+2) + " is prime!");
      }
    }
  }
}