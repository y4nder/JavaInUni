//Exercise 1

public class PayrollProgram{
   public static void main (String [] args){
         long hoursWorked = 500 ; 
         double payRate    = 10.0, taxRate = 0.10;
         System.out.println("Hours Worked: " + hoursWorked);
         System.out.println("pay amount: " + (hoursWorked * payRate));
         System.out.println("tax amount: " + (hoursWorked * payRate * taxRate));
      }
}

//when numbers were removed from the variable,
   //an error was prompted saying the variable was not initialized