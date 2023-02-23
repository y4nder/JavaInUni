import java.util.*;
import java.text.*;

public class ValueOfDeposit{
   public static void main(String[] args){
      double initialDeposit, interestRate, timesPerYear, numOfYears, value;
      Scanner scan = new Scanner(System.in);
      DecimalFormat val = new DecimalFormat("$0.00");          //decimal format to display dollar sign "$"
      
      System.out.print("Initial deposit: ");
      initialDeposit = scan.nextDouble();
      
      System.out.print("Interest rate: ");
      interestRate = scan.nextDouble();

      System.out.print("Times per year: ");
      timesPerYear = scan.nextDouble();
      
      System.out.print("Number of years: ");
      numOfYears = scan.nextDouble();
     
      value = initialDeposit * (Math.pow( (1 + (interestRate/timesPerYear)), (timesPerYear * numOfYears) ));
      System.out.println("Value: " + val.format(value));    //the value of variable "value" is now displayed with a dollar sign in the beginning
   }
}