import java.util.* ;

public class ContinuousInterest
{
  public static void main (String[] args) 
  {
    Scanner scan = new Scanner( System.in );
    double rate, years, principal, amount;

    // read in the interest rate, as a fraction,
    // years and principal
    System.out.print  ("Enter rate:");
    rate = scan.nextDouble();  
    System.out.print  ("Enter years:");
    years = scan.nextDouble();  
    System.out.print  ("Enter principal:");
    principal = scan.nextDouble();  
    
    // calculate the amount after years of growth
    amount = principal*Math.exp( rate*years );
    
    // write out the result
    System.out.println("current amount: " + amount );
    
  }
}

/*
static double min(double a, double b)
Returns the smaller of two double values.

static float min(float a, float b)
Returns the smaller of two float values.

static int min(int a, int b)
Returns the smaller of two int values.

static long min(long a, long b)
Returns the smaller of two long values.
*/