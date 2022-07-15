import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("d"); 
    l.add("c"); 
    l.add("b"); 
    l.add("a"); 
    System.out.println(l);

    System.out.println(l.get(4));
    System.out.println(l.get(5));
  }
}
