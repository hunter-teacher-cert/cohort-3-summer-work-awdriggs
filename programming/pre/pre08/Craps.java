import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Craps {

  // You will write a program named Craps.java that will play a simplified game of craps.

  // There should be at least three static methods in addition to main.
  //One named roll which accepts an integer parameter and returns a random number between 1 and that number, inclusive.
  public static int roll(int sides){
    Random rando = new Random();
    return rando.nextInt(sides) + 1;
  }
  // There should also be one named shoot which accepts two parameters
  //- a number of dice and the maximum value for those dice
  // and returns the result of rolling those dice.

  public static int shoot(int numDice, int numSides){
    int result = 0;

    for(int i = 0; i < numDice; i++){
      result += roll(numSides);
    }

    return result;
  }


  // The third method should be named round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.

  public static boolean round(){
    // A round is played as follows:

    // The shooter shoots (rolls) the dice.
    int value = shoot(2, 6);

    // If he rolls a 2,3, or 12,that’s Craps and he loses.
    // If he rolls a 7 or 11, that’s a Natural and he wins.
    if(value == 2 || value == 3 || value == 12){ //craps!
      System.out.println("Rolled " + value + "! Crap.");
      return false; //lose
    } else if(value == 7 || value == 11){ //natural!
      System.out.println("Rolled " + value + "! A natural.");
      return true; //thats a win
    } else {
      int point = value;
      System.out.println("Rolled " + point + ". Roll till a match or 11.");

      while(true){
        value = shoot(2, 6);

        if(value == point){
          System.out.println("Match!");
          return true;
        } else if(value == 11){
          System.out.println("11 hit!");
          return false;
        } else {
          System.out.println("Rolled " + value + "! Roll again.");
        }
      }
    }
  }
  // The main program should take a parameter from the command line, play that many rounds and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.
  public static void main(String[] args){
    // for(int i = 0; i < 200; i++){
    //   System.out.println("shoot: " + shoot(2, 6));
    // }
    // System.out.println(round());
    Scanner in = new Scanner(System.in);
    System.out.println("Let's Play Craps!");
    System.out.print("How many rounds? ");
    int numRounds = in.nextInt();
    in.nextLine();
    int house = 0;
    int shooter = 0;

    for(int i = 0; i < numRounds; i++){
      System.out.println("\nRound " + (i+1));

      boolean status = round();

      if(status){
        System.out.println("\nYou win!");
        shooter++;
      } else {
        System.out.println("\nYou lose!");
        house++;
      }

      System.out.println("\nShooter: " + shooter + " , House: " + house);
      if(i < numRounds - 1){
        System.out.print("Press ENTER for next round");
        in.nextLine();
      }
    }

    System.out.println("Game Over!");

    if(shooter > house){
      System.out.println("Shooter wins");
    } else if(house > shooter){
      System.out.println("House wins");
    } else {
      System.out.println("It's a tie");
    }
  }
}
