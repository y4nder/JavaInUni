import java.util.Scanner;
public class IntDivideTest {
   public static void main ( String [] args ) {
      Scanner sc = new Scanner(System.in);
      int dividend, divisor;
      int quotient, remainder; 
      
      System.out.print("Enter dividend: ");
      dividend = sc.nextInt();
      
      System.out.print("Enter divisor: ");
      divisor = sc.nextInt();
      
      quotient = dividend / divisor;
      remainder = dividend % divisor;
      
      System.out.println(dividend + " / " + divisor + " is " + quotient);
      System.out.println(dividend + " % " + divisor + " is " + remainder);
      System.out.println(quotient + " * " + divisor + " + " + remainder + " is " 
                           + (quotient * divisor + remainder));
   }
}