import java.util.*;

public class CosineCalc
{
  public static void main (String[] args)  
  {
    double value;
    Scanner scan = new Scanner( System.in );
 
    System.out.print("Enter radians:");
    value = scan.nextDouble();
    
    // calculate its cosine
    double result = Math.cos( value );
    
    // write out the result
    System.out.println("cosine: " + result );
  }
}

/*
   java.lang 
   Class Math
   
   ... 
   
   cos
   
   public static double cos(double a)
   Returns the trigonometric cosine of an angle.
   
   sin
   
   public static double sin(double a)
   Returns the trigonometric sine of an angle.
   
   tan
   
   public static double tan(double a)
   Returns the trigonometric tangent of an angle.
   
   cos is a static function of the class Math, which is found in the java.lang package. 
   Classes from that package (such as String and Math) are so common that you do not have to import the package. 
   The angle a is a double and must be expressed in radians. The return value is a double.
   
   exp

   static double	exp(double a)
   Returns Euler's number e raised to the power of a double value.
   
   pow

   static double	pow(double a, double b)
   Returns the value of the first argument raised to the power of the second argument.
*/