/**
 * Rational class by Team 14 
 * Adam Driggers 
 * collaborators: David , Elizabeth Last
 */


/**
  class Rational
  An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
  and facilitate mathematical operations with another instance of class Rational.

  Basic level (complete all):
  - toString
  - default constructor
  - multiply
  - divide

  Intermediate level (complete Basic methods plus these methods):
  - floatValue
  - overloaded constructor

  Advanced level (complete Basic + Intermediate + these methods):
  -

*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    _numerator = 0;
    _denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    if(d == 0){
      System.out.println("Invalid denominator! Value set to 0/1");
    } else {
      _numerator = n;
      _denominator = d;
    }
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    return _numerator + "/" + _denominator;
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point rimitive
  public double floatValue()
  {
    //trying to be super clever, taught java how to long divide...
    double decimal = 0.0;
    int dn = _numerator; //dividend, will upadate in the loop
    int dv = _denominator; //divisor, never changes
    double place; 
    //what power of 10 are we at?
    for(int i = 0; i <= 16; i++){ //a double has 16 digits
      int value = dn / dv; //integer divison
      place = Math.pow(10, i * -1); //what place value are we at? 
      decimal += value * place; //mutliply value by place value, add to decimal
      dn = dn % dv * 10; //recalculate the dividend (dn)
    }
   
    return decimal;
    //as modelled in class
    // return (double) _numerator/_denominator;
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    _numerator = _numerator * r._numerator;
    _denominator = _denominator * r._denominator;
  }

  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    if(r._numerator == 0){
      System.out.println("Can't divide by 0 numerator");
    } else {
      _numerator = _numerator * r._denominator;
      _denominator = _denominator * r._numerator;
    }
  }

}//end class
