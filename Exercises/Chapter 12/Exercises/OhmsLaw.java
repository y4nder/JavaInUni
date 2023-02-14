import java.util.Scanner;

public class OhmsLaw {
   public static void main ( String [] args ) {
      
      double i;
      int v, r;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Voltage: ");
      v = sc.nextInt();
      
      System.out.print("Enter Resistance: ");
      r = sc.nextInt();
      
      i = (v + 0.0) / r;
      
      System.out.print("the current flowing is " + i + " ohms");
   }
}