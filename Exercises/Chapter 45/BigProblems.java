import java.util.Scanner;
import java.io.*;

class BigProblems
{
  public static void main ( String[] args )
  {
    boolean goOn = true;
    Scanner scan = new Scanner( System.in );
    System.out.println( "Enter an integer: ");
    int data = scan.nextInt();
    while ( goOn = true )
    {
      if ( data%2 = 1 )
        System.out.println( "Your number is odd" );
      if ( data%2=0 )
        System.out.println( "Your number is even" );

      System.out.println( "Enter another integer or 0 to quit: ");
      data = scan.nextInt();
      if ( data == 0 ) goOn = false;
    } 
  }
}