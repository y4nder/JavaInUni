import java.util.Scanner;
public class UnluckyNumbers{
   public static boolean checkDigit(long num){
      long x = 0;
      do{
         if(num % 10 == 3){
            x = num % 10;
         }
        
         num = num / 10;
         
         if(x == 3 && num % 10 == 1)
            return true;
         else
            x = 0;
      }
      while(num > 0);
      
      return false;
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      long num = 1;
      boolean x = false;

      while(num >= 0){
         System.out.print("Enter a number: ");
         num = scan.nextLong();
         
         x = checkDigit(num);
         
         if(x == true)
            System.out.println(num + " is unlucky");
         else
            System.out.println(num + " is safe");   
      }
   }
}