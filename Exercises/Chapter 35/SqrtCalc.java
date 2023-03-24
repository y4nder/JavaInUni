import java.util.Scanner;

public class SqrtCalc
{
  public static void main( String[] args )
  {
    String chars;
    double x;
    Scanner scan = new Scanner(System.in );

    chars = "yes" ;        // enable first iteration of the loop

    while ( chars.equals( "yes") || chars.equals( "YES" ) ||  
            chars.equals( "y" ) ||  chars.equals( "Y" )  )
    {
      System.out.print("Enter a number-->");
      x = scan.nextDouble(); 
      chars = scan.nextLine();   // flush rest of the line
      System.out.println("Square root of " + x + " is " + Math.sqrt( x ) );
      System.out.print("Do you wish to continue? (yes or no) --> ");
      chars = scan.nextLine();
   }

  }
}