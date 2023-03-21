import java.util.Scanner;
public class SumOfRange{
   public static void main(String[] args){
      int low, high, sum = 0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter low: ");
      low = scan.nextInt();
      
      System.out.print("Enter high: ");
      high = scan.nextInt();
      
      int count = low;
      while (count <= high){
         sum = sum + count;
         count = count + 1;
      }
      
      System.out.println("Looped Sum = " + sum);
      
      sum = ( ( high * (high+1) /2 ) ) - ( ( low * (low - 1) /2 ) );
      
      System.out.println("Formula Sum = " + sum);
   }
}