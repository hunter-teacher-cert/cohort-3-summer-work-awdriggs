import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Guess {
  public static void main(String[] args) {
    // pick a random number
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    int guess;
    
    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
    System.out.print("Your Guess: ");

    Scanner in = new Scanner(System.in);
    guess = in.nextInt();

    System.out.printf("You guess %d, my numbers was %d, you were off by %d!\n", guess, number, Math.abs(guess - number));
    
    //System.out.println("");
  }
}