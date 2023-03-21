//exercise 1
import java.util.Scanner;
public class  ModifiedMillionDollars{
  public static void main(String[] args ) 
  {
    double dollars = 0.0;
    double rate, initialAmount, annualContr;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter interest rate: ");
    rate = scan.nextDouble() / 10000.0 ;
    
    System.out.print("Enter initial investment: ");
    initialAmount = scan.nextDouble();
    
    System.out.print("Enter annual contribution: ");
    annualContr = scan.nextDouble();
 
    while ( dollars < 1000000 ){
       // change to the next rate
       rate = rate + 0.001;

       // compute the dollars after 40 years at the current rate
       int year =  1 ;     
       dollars = initialAmount;     
       while (  year <= 40 ){     
         dollars = dollars + dollars*rate  ; // add another year's interest     
         dollars = dollars + annualContr;          // add in this year's contribution
         year    =  year + 1 ;
       }
    }

    System.out.println("After 40 years at " + rate*100 
      + " percent interest you will have " + dollars + " dollars" );
  }

}