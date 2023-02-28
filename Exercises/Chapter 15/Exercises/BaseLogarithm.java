//Exercise 1
import java.lang.Math;
import java.util.Scanner;

public class BaseLogarithm{
   public static void main(String[] args){
      double x, e;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter x: ");
      x = scan.nextDouble();
      
      e = Math.pow((1 + (1/x)), x);
      //System.out.println(e);
      System.out.printf("Approximation to e:%10.7f", e);
   }
}