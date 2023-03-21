import java.util.Scanner;
public class PowerOfANumber{
   public static void main(String[] args){
      float base, result = 1;
      int exp;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter base number: ");
      base = scan.nextFloat();
      
      System.out.print("Enter exponent: ");
      exp = scan.nextInt();
      
      if(exp < 0){
         System.out.println("base number must be a positive integer");
      }
      else{
         int count = 0;
         while(count < exp){
            result *= base;
            count++;
         }
         System.out.println(base + " raised to the power " + exp + " is: " + result);
      }
   }
}