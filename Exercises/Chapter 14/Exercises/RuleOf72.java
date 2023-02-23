import java.text.*;
import java.util.*;

public class RuleOf72{
   public static void main(String[] args){
      double interestRate, years;
      Scanner scan = new Scanner(System.in);
      DecimalFormat rate = new DecimalFormat("0%");
      
      System.out.print("Interest rate: ");
      interestRate = scan.nextDouble();
      
      years = 72.0 / (interestRate / 0.01);     
      System.out.println("with " + rate.format(interestRate) + " interest it takes about " + years + " years");
   } 
}
//output
   /* Interest rate: 0.10
      with 10% interest it takes about 7.2 years*/


//in program ValueOfDeposit.java 
   /* Initial deposit: 100
      Interest rate: 0.10
      Times per year: 6
      Number of years: 7.2 
      Value: $204.23 ---------------- it did double the initial deposit in 7.2 years
      */