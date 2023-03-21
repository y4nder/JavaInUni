import java.util.Scanner;
public class SumOfSequentialIntegers{
   public static void main(String[] args){
      int n, sum = 0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter N: ");
      n = scan.nextInt();
      
      int count = 1;
      
      while(count < n){
         sum = (n * (n+1) )/2;
         count++;
      }
      System.out.println("Looped Sum: " + sum);
      
      sum = (n * (n+1) )/2;
      System.out.println("Formula sum:  " + sum);

   }
}