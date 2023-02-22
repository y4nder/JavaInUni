//Exercise 1

public class PayrollProgram{
   public static void main (String[] args){
         long hoursWorked = 40; 
         double payRate    = 10.0, taxRate = 0.10;
         System.out.println("Hours Worked: " + hoursWorked);
         System.out.println("pay amount: " + (hoursWorked * payRate));
         System.out.println("tax amount: " + (hoursWorked * payRate * taxRate));
      }
}

//when numbers were removed from the variable,
   //an error was prompted saying the variable was not initialized
   
//if hoursWorked = ; -- expression not valid
      /* PayrollProgram.java:5: error: illegal start of expression
            long hoursWorked =  ; 
                                ^
            1 error*/

//long hoursWorked; -- not initialized. it expects a value because the variable is used in an expression
      /* PayrollProgram.java:7: error: variable hoursWorked might not have been initialized
            System.out.println("Hours Worked: " + hoursWorked);
                                                  ^
         1 error*/
