import java.io.*;
import java.util.*;

public class Beer {
	public static void beer(int n){
	  if(n > 0) {
      verse(n);
    } else {
      last();
    }
	}

  public static void verse(int n){
    System.out.println(n + " bottles of beer on the wall,");
    System.out.println(n + " bottles of beer,");
    System.out.println("ya’ take one down, ya’ pass it around,");
    System.out.println((n-1) + " bottles of beer on the wall.");
    System.out.println();
    
    beer(n - 1);
  }

  public static void last(){
    System.out.println("No bottles of beer on the wall,");
    System.out.println("no more bottles of beer");
    System.out.println("ya' can't take one down, ya' can't pass it around,");
    System.out.println("'cause there are no more bottles of beer on the the wall!");
  } 

  public static void main(String[] args){
    beer(99);
  }
}
    
