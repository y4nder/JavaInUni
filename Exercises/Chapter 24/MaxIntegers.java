import java.util.Scanner;
public class MaxIntegers{
   public static void main(String[] args){
      int sum = 0, value = 0, count;                  //sum and value is initialized to 0. 
      int max = value;                                //variable max is initialized to value which is 0.
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter 5 integers");
      
      //ask input from user 5 times
      for(count = 0; count < 5; count++){
      
         System.out.print("\nInteger #" + (count+1) + ": ");
         value = scan.nextInt();
         
         //compares variable max to variable value.
         if(max < value){
            max = value;                           //if condition is true, user input is stored in variable max.
         }
         
         sum += value;  //add value to sum
      }

      System.out.println("\nSum: " + sum);              //display the sum of all integers.
      System.out.println("Maximum: " + max);          //display the highest integer input.
   }
}