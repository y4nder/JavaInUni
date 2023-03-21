import java.util.Scanner;
public class AddingIntegers{
   public static void main(String[] args){
      int value, sum = 0;                                   //initialize sum to 0;                                
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the first integer (enter 0 to quit): ");
      value = scan.nextInt();                               //User input for value
      
      if(value == 0){                                       //if the first input is 0 no integers were entered
         System.out.println("No integers were entered.");
      }
      else{                                                 //if the first input is not 0 then the program will proceed                      
         while(value != 0){                                    //the program will loop if the value is not 0
         sum += value;                                         //add value to sum
         
         System.out.print("Enter an integer (or 0 to quit): ");
         value = scan.nextInt();                               //get user input again
         }
         System.out.println("Sum of the integers: " + sum);    //if value is 0, sum of all input will displayed
      }

      System.out.println("bye");
            
   }
}