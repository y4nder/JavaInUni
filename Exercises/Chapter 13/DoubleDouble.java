//import java.io*;
import java.util.Scanner;

public class DoubleDouble{
   public static void main(String[] args){
      double value;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a double: ");
      value = scan.nextDouble();
      
      System.out.print("value: " + value + " twice value: " + 2.0 * value);
   }
}

// value: 3.14 twice value: 6.28

/* value = rats
 Exception in thread "main" java.util.InputMismatchException
 	at java.base/java.util.Scanner.throwFor(Scanner.java:943)
 	at java.base/java.util.Scanner.next(Scanner.java:1598)
 	at java.base/java.util.Scanner.nextDouble(Scanner.java:2569)
 	at DoubleDouble.main(DoubleDouble.java:10)

Scientific notation

   the letter E is used to mean "10 to the power of."
   
   value: 1.234E9 twice value: 2.468E9
   
   value: -0.07001 twice value: -0.14002
   
      The input characters may use an upper or lower case "e":
*/

