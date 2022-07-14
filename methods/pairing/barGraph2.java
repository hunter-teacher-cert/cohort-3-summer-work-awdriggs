import java.io.*;
import java.util.*;

public class barGraph2 {

  public static void main(String[] args){
    ArrayList<Integer> numList= new ArrayList<Integer>();
    //setup the array
    Random random = new Random();
    for (int i  = 0; i < 4; i++){
      numList.add(random.nextInt(10));
    }

    System.out.println(numList);//prints the list for debugging
     
    //string for last line
    String last = "";
    int max = 0; //hold the bigest num
    for(int i = 0; i < numList.size(); i++){ //prints lines
      if(numList.get(i) >= max){
        max = numList.get(i);
      }
      last += i + " ";//update last line
    }

    for(int i = max; i >= 0; i--){ //loop from end to start
      for(int j = 0; j < numList.size(); j++){
        if(numList.get(j) > i){//print a star
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        System.out.print(" "); //space fore formatting
      }
      System.out.println("");//next line
    }

    //prnt the last line
    System.out.println(last);

  }
}
