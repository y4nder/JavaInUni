import java.util.Scanner;
public class HarmonicSum{
   public static void main(String[] args){
      int n, count = 1;
      double sum = 0.0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter N: ");
      n = scan.nextInt();
      
      while(count <= n){
         sum += 1.0/count;
         count++;
      }
      System.out.println("Sum is: " + sum);
   }
}