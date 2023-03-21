//Exercise 2
import java.util.Scanner;
public class SumOfSequentialIntegers{
   public static void main(String[] args){
      int n, sum = 0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter N: ");   //Enter an integer
      n = scan.nextInt();
      
      int count = 1;             //start of loop counter
      while(count <= n){
         sum = sum + count;         //looped formula         
         count++;
      }
      System.out.println("Looped Sum: " + sum); // display result from looped formula
      
      sum = (n * (n+1) )/2;            //mathematical formula without loop
      System.out.println("Formula sum:  " + sum); //display result from formula without loop

   }
}