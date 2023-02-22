import java.util.Scanner;

public class LogarithmBaseTwo{
   public static void main(String[] args){
      double x, base2Log;
      int y = 2; //change value for base log;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter double: ");
      x = scan.nextDouble();
      
      base2Log = Math.log(x) / Math.log(y);
      
      System.out.println("Base " + y + " log of " + x + " is " + base2Log);
   }
}

/*
Write a program that inputs a number and outputs its base 2 logarithm. Use floating point input. This problem would be easy, but the Math package does not have a base 2 logarithm method. Instead you have to do this:

log2 X = (loge X) / (loge 2)
Here, loge X is the natural logarithm of X, which you can compute using

Math.log(
*/
