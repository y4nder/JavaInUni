import java.util.Scanner;
public class UnluckyNumbers{
   public static boolean checkLuck(long num){
      boolean x = false;
      for( ; num > 0; num /= 10){ 
         if(x == true && num % 10 == 1) 
            return true;
         else 
            x = false;

         if(num % 10 == 3) x = true;
      }

      return false;
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      long num;

      System.out.println("To exit, enter a negative value");
      do{
         System.out.print("Enter a number: ");
         num = scan.nextLong();
         if(num < 0) break;

         String y = (checkLuck(num) == true)? " is unlucky" : " is safe";           
         System.out.println(num + y);
      }
      while(num >= 0);
   }
}