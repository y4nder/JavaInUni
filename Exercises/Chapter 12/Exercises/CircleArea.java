//Exercise 1
import java.util.Scanner;

public class CircleArea {
   public static void main ( String [] args ) {
      Scanner sc = new Scanner(System.in);
      int rad;
      double area;
      
      System.out.print("Input the radius: ");
      rad = sc.nextInt();
      
      area = Math.PI * (rad * rad);
      
      System.out.println("The radius is: " + rad + " The area is: " + area);
      
   }
}