import java.io.*;
import java.util.*;

public class Driver {

  public static void main(String[] args){
    //testing part 1
    Node n1 = new Node(5);
    System.out.println("Node 1: " + n1.toString());
    Node n2 = new Node(10);
    System.out.println("Node 2: " + n2.toString());
    n1.setNext(n2);
    System.out.println("Node 1: " + n1.toString());

    n2.setNext(new Node(15));
    System.out.println("Node 2: " + n2.toString());

    n2 = new Node(20);
    System.out.println("Node 2: " + n2.toString());

    Node n3 = new Node(25,n2);
    System.out.println("Node 3: " + n3.toString());

    //testing part 2
    n2.setNext(n1);
    n1=n3;
    System.out.println("Node 1: " + n1.toString());
    System.out.println("Node 2: " + n2.toString());
    System.out.println("Node 3: " + n3.toString());
  }
}
