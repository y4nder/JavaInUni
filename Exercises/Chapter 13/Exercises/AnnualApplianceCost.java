import java.util.Scanner;

public class AnnualApplianceCost{
   public static void main(String[] args){
      double costPerKilowattHour;
      int kilowattHoursYear;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter cost per kilowatt-hour: ");
      costPerKilowattHour = scan.nextDouble();
      
      System.out.print("Enter kilowatt-hours used per year: ");
      kilowattHoursYear = scan.nextInt();
      
      System.out.println("Annual cost: " + costPerKilowattHour * 0.01 * kilowattHoursYear);
   }
}