//exercise 5
import java.util.Scanner;
public class GroundBeef{
   public static void main(String[] args){
      double pricePerPoundA,  pricePerPoundB,costPerPoundA, costPerPoundB;
      int percentLeanA, percentLeanB;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Price per pound package A: ");
      pricePerPoundA = scan.nextDouble();
      
      System.out.print("Percent lean package A: ");
      percentLeanA = scan.nextInt();
      
      System.out.print("Price per pound package B: ");
      pricePerPoundB = scan.nextDouble();         
       
      System.out.print("Percent lean package B: ");
      percentLeanB = scan.nextInt();
      
      costPerPoundA = pricePerPoundA * 100 / percentLeanA;
      costPerPoundB = pricePerPoundB * 100 / percentLeanB;
      
      System.out.println("Package A cost per pound of lean: " + costPerPoundA);
      System.out.println("Package B cost per pound of lean: " + costPerPoundB);
      
      if(costPerPoundA < costPerPoundB)
         System.out.println("Package A is the best value");
      else
         System.out.println("Package B is the best value");  
   }
}