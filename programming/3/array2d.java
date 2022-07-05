import java.io.*;
import java.util.*;

public class array2d {

  public static void main(String[] args){
    System.out.println("yo"); 
     
    int [][] foo = new int[3][5];

    System.out.println(foo.length); //prints 3
    System.out.println(foo[0].length); //prints 5 
    
    //jagged array
    int [][] jag = new int[3][];
    jag[0] = new int[3];
    jag[1] = new int[4];
    jag[2] = new int[2];
  }
}
