//Exercise 1
import java.util.Scanner;
public class RunOfIntegers{
   public static void main(String[] args){
      int start, end, count = 0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Start: ");     //Enter value for where to start the counter
      start = scan.nextInt();
      
      System.out.print("Enter End: ");    //Enter value for where the counter will end
      end = scan.nextInt();
      
      while(start <= end){             //the condition checks if the counter has reached the end number
         System.out.println(start);
         start = start + 1;         //this expression adds 1 to the start variable
      }
   }
}