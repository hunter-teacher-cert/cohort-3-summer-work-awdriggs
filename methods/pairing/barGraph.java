import java.io.*;
import java.util.*;

public class BarGraphify {

  public static void main(String[] args){
    ArrayList<Integer> numList= new ArrayList<Integer>();
    //setup the array
    Random random = new Random();
    for (int i  = 0; i < 4; i++){
      numList.add(random.nextInt(10));
    }

    System.out.println(numList);//prints the list
                                //[0,1,2,3]
    for(int i = 0; i < numList.size(); i++){
      int barNum = numList.get(i);
      System.out.print(i + ": ");
      for(int j = 0; j<barNum; j++){
        System.out.print("=");
      }
      System.out.println("");
      // System.out.println(numList.get(i)); prints the value at i
      //pretend we are 3, value is 3
      //3 is 3 spots from 0p


    }


  }
}
