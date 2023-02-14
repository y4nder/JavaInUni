import java.util.Scanner;

public class AddTwo {
   public static void main ( String [] args ) {
      Scanner sc = new Scanner(System.in);
      
      int first, second, sum;
      
      System.out.print("Enter first integer: ");
      first = sc.nextInt();
      
      System.out.print("Enter second integer: ");
      second = sc.nextInt();
      
      sum = first + second;
      
      System.out.println("The sum of " + first + " plus " + second + " is " + sum);
   }
}