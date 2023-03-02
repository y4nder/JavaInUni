//exercise 3
import java.util.Scanner;
public class LastChanceGas{
   public static void main(String[] args){
      int capacity, milesPerGallon, gage, gas;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Tank Capacity: ");
      capacity = scan.nextInt();
      
      System.out.print("Gage reading: ");
      gage = scan.nextInt();
      
      System.out.print("Miles per gallon: ");
      milesPerGallon = scan.nextInt();
      
      gas = (((capacity * milesPerGallon) * gage) / 100);
      
      if (gas<200)
         System.out.println("Get Gas!");
      else
         System.out.println("Safe to Proceed!");
   }
}