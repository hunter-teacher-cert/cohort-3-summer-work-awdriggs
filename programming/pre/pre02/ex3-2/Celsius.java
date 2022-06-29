import java.util.Scanner;

public class Celsius {
  public static void main(String[] args) {
    double c, f;
    final double CONVERT = 1.8;
    Scanner in = new Scanner(System.in);
    
    // prompt the user and get the value
    System.out.print("Temp in Celsius: ");
    c = in.nextDouble();
    f = c * CONVERT + 32;

    System.out.printf("%.2f C = %.2f F\n", c, f);
  }
}