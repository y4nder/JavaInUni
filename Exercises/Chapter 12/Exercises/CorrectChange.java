import java.util.Scanner;

public class CorrectChange {
   public static void main ( String [] args ) {
      Scanner sc = new Scanner(System.in);
      int intlCents, dollar, quarter, dime, nickel;
      
      System.out.print("Input cents: ");
      intlCents = sc.nextInt();
      
      dollar = intlCents / 100;
      intlCents = intlCents % 100;
      
      quarter = intlCents / 25;
      intlCents = intlCents % 25;
      
      dime = intlCents / 10;
      intlCents = intlCents % 10;
      
      nickel = intlCents / 5;
      intlCents = intlCents % 5;
      
      System.out.println("Your change is: " + dollar + " dollars, " + quarter + " quarters, " 
                           + dime + " dimes, " + nickel + " nickels," + " and " + intlCents + " pennies.");  
   }
}