import java.util.Scanner;
public class  SquareRoot
{

  public static void main( String[] args ) 
  {
    final double smallValue = 1.0E-14 ;
    double N;
    double guess = 1.00 ;
    
   Scanner scan = new Scanner( System.in );
    System.out.println("Enter the number:"); 
    N = scan.nextDouble();

    while ( Math.abs( N/(guess*guess) - 1.0 ) > smallValue )
    {      
       guess =  N/(2*guess) + guess/2 ; // calculate a new value for the guess
    }

    System.out.println("The square root of " + N + " is " + guess ) ;
  }
}
