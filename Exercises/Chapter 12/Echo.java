import java.util.Scanner;

public class Echo {
   public static void main ( String [] args ) {
      String inData;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the data: ");
      inData = scan.nextLine();
      
      System.out.println("You entered: " + inData);
   }
}