import java.util.Scanner;

public class SquareRoot
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    double value;

    // read in a double
    System.out.print  ("Enter a double: ");
    value = scan.nextDouble();
    
    // calculate its square root
    double result = Math.sqrt( value );
    
    // write out the result
    System.out.println("square root: " + result );
  }
}

/*
public static double sqrt(double a)

Returns the correctly rounded positive square root of a double value. Special cases:
   If the argument is NaN or less than zero, then the result is NaN.
   If the argument is positive infinity, then the result is positive infinity.
   If the argument is positive zero or negative zero, then the result is the same as the argument.
   Otherwise, the result is the double value closest to the true mathematical square root of the argument value.

Parameters:
a - a value.

Returns:
the positive square root of a. If the argument is NaN or less than zero, the result is NaN.
*/