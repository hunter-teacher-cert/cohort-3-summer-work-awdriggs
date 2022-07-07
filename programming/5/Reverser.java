/**
 * Recursive String Reverser by Team Palindromotosis
 * First Last
 * collaborators: First Last, First Last
 */


public class Reverser
{
  /**
    String reverseF(String) -- recursive String reverser
precond:  input String is non-empty
postcond: returns input String with chars in reverse order
*/
  public static String reverseR( String s )
  {
    if(s.length() > 0){
      return reverseR(s.substring(1)) + s.charAt(0);
    } else {
      return s;
    }
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?

    //testing substring code
    // String test = "even";
    // System.out.println(test.substring(0,1)); //first char
    // System.out.println(test.substring(1, test.length())); //everything but the last char
  }
}
