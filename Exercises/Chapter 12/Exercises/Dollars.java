import java.util.Scanner;

public class Dollars {
   public static void main ( String [] args ) {
      Scanner sc = new Scanner(System.in);
      int cents;
      int dollars, rem;
      
      System.out.print("Input the cents: ");
      cents = sc.nextInt();
      
      dollars = cents / 100;
      rem = cents % 100;
      
      System.out.println("That is " + dollars + " dollars and " + rem + " cents");
   }
}