import java.util.Scanner;

public class HarmonicMean{
   public static void main(String[] args){
      int x,y;
      double mean;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter x: ");
      x = scan.nextInt();
      
      System.out.print("Enter y: ");
      y = scan.nextInt();
      
      mean = (x + y) / 2;
      System.out.println("Arithmetic mean: " + mean);
      
      mean = 2 / ((1.0/x) + (1.0/y));
      System.out.println("Harmonic   mean: " + mean);
      
   }
}


//error occured at line 18
/*  Exception in thread "main" java.lang.ArithmeticException: / by zero
 	at HarmonicMean.main(HarmonicMean.java:18)*/
   
   // reason 1/x was integer division, fix : changed 1 to 1.0 --> (1.0/x)