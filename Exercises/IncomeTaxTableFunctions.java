//test comment
import java.text.DecimalFormat;
import java.util.Scanner;

public class IncomeTaxTableFunctions{
   public static void main(String[] args){
      int hoursWorked, ratePerHour;
      long incomeTax, annualNetPay, monthlyGrossPay, annualGrossPay;
      
      do{
         //input data
         hoursWorked = getHoursWorked();
         ratePerHour = getRatePerHour();
   
         //process data
         monthlyGrossPay = computeMonthlyGrossPay(hoursWorked, ratePerHour);
         annualGrossPay = computeAnnualGrossPay(monthlyGrossPay);
         incomeTax = computeIncomeTax(annualGrossPay);
         annualNetPay = computeAnnualNetPay(annualGrossPay, incomeTax);
     
         //display data
         displayData(monthlyGrossPay, annualGrossPay, incomeTax, annualNetPay);

      }
      while( getOption().toUpperCase().equals("Y") );           
   }
   
   //Methods
   public static int getHoursWorked(){
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter number of hours worked    : ");
      return scan.nextInt();
   }
   
   public static int getRatePerHour(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter rate per hour             : ");
      return scan.nextInt();   
   }
   
   public static long computeMonthlyGrossPay(int hoursWorked, int ratePerHour){
      return hoursWorked * ratePerHour;
   }
   
   public static long computeAnnualGrossPay(long monthlyGrossPay){
      return monthlyGrossPay * 12;
   }
   
   public static long computeIncomeTax(long annualGrossPay){
      if(annualGrossPay <= 250000){
         return 0;
      }
      else if(annualGrossPay > 250000 && annualGrossPay <= 400000){
         return (annualGrossPay - 250000) * 15 / 100;  
      }
      else if(annualGrossPay > 400000 && annualGrossPay <= 800000){
         return ((annualGrossPay - 400000) * 20 / 100) + 22500;   
      }
      else if(annualGrossPay > 800000 && annualGrossPay <= 2000000){
         return ((annualGrossPay - 800000) * 25 / 100) + 102500;
      }
      else if(annualGrossPay > 2000000 && annualGrossPay <= 8000000){
         return ((annualGrossPay - 2000000) * 30 / 100) + 402500;
      }
      else{
         return ((annualGrossPay - 8000000) * 35 / 100) + 2202500;
      }
      
   }
   
   public static long computeAnnualNetPay(long annualGrossPay, long incomeTax){
      return annualGrossPay - incomeTax;
   }
   
   public static void displayData(long monthlyGrossPay, long annualGrossPay, long incomeTax, long annualNetPay){
      DecimalFormat form = new DecimalFormat();
      System.out.println("Monthly Gross Pay               : " + form.format(monthlyGrossPay));
      System.out.println("Annual Gross Pay                : " + form.format(annualGrossPay));
      System.out.println("Income Tax Pay                  : " + form.format(incomeTax));
      System.out.println("Annual Net Pay                  : " + form.format(annualNetPay));
   }
   
   public static String getOption(){
      String option;
      Scanner scan = new Scanner(System.in);
      
      do{
         System.out.print("Do you want to continue? (y/n) : ");
         option = scan.nextLine();
      }
      while( !option.toUpperCase().equals("Y") && !option.toUpperCase().equals("N") );
      
      return option;
   }
}

