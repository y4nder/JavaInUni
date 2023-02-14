import java.util.Scanner;

public class EchoSquare {
   public static void main ( String [] args ) {
      Scanner sc = new Scanner (System.in);
      int num, square;
      
      System.out.print("Enter an integer: ");
      num = sc.nextInt();
      square = num * num;
      
      System.out.println("The square of " + num + " is " + square);      
   }
}