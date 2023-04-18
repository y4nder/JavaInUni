import java.text.DecimalFormat;
import java.util.Scanner;
public class IncomeTaxTableFunctions{
   public static void main(String[] args){
      int hoursWorked, ratePerHour;
      long incomeTax, annualNetPay, monthlyGrossPay, annualGrossPay;
      //Scanner scan = new Scanner(System.in);
      DecimalFormat form = new DecimalFormat();
      
      //input data
      hoursWorked = getHoursWorked();
      ratePerHour = getRatePerHour();

      //process data
      monthlyGrossPay = 
      
      monthlyGrossPay = hoursWorked * ratePerHour;
      annualGrossPay = monthlyGrossPay * 12;
      
      if(annualGrossPay <= 250000){
         incomeTax = 0;
      }
      else if(annualGrossPay > 250000 && annualGrossPay <= 400000){
         incomeTax = (annualGrossPay - 250000) * 15 / 100;  
      }
      else if(annualGrossPay > 400000 && annualGrossPay <= 800000){
         incomeTax = ((annualGrossPay - 400000) * 20 / 100) + 22500;   
      }
      else if(annualGrossPay > 800000 && annualGrossPay <= 2000000){
         incomeTax = ((annualGrossPay - 800000) * 25 / 100) + 102500;
      }
      else if(annualGrossPay > 2000000 && annualGrossPay <= 8000000){
         incomeTax = ((annualGrossPay - 2000000) * 30 / 100) + 402500;
      }
      else{
         incomeTax = ((annualGrossPay - 8000000) * 35 / 100) + 2202500;
      }
      
      annualNetPay = annualGrossPay - incomeTax;
      
      System.out.println("Monthly Gross Pay               : " + form.format(monthlyGrossPay));
      System.out.println("Annual Gross Pay                : " + form.format(annualGrossPay));
      System.out.println("Income Tax Pay                  : " + form.format(incomeTax));
      System.out.println("Annual Net Pay                  : " + form.format(annualNetPay));
   }
   
   public static int getHoursWorked(){
      int hourWorked;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter number of hours worked    : ");
      hoursWorked = scan.nextInt();
      
      return hoursWorked;
   }
   public static int getRatePerHour(){
      int ratePerHour;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter rate per hour             : ");
      ratePerHour = scan.nextInt();
      
      return ratePerHour;
   }
   
   public static long computeMonthlyGrossPay()
   
}


/*

input data:
getHoursWorked();
getRatePerHour();

process data:
computeMonthlyGrossPay();
computeAnnualGrossPay();


*/
