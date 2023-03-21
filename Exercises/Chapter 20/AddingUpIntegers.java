import java.util.Scanner;
public class AddingUpIntegers{
   public static void main(String[] args){
      int limit, num = 0, count = 0, sum = 0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How many integers will be added?: ");
      limit = scan.nextInt();
      
      while(count < limit){
         System.out.print("Enter an integer: ");
         num = scan.nextInt();
         sum += num;
         count++;
      }
      System.out.println("The sum is " + sum);
   }
}