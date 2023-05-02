import java.util.Scanner;
public class OdiousNumbers{
   static int odd;
   
   public static boolean bit(long num){
      odd = 0;
      do{
         if(num % 2 == 1) oddCount();
         num = num / 2;
      }
      while(num > 0);
      
      if(odd % 2 == 0)
         return false;
      else
         return true;
      
   }
   
   public static void oddCount(){
      odd++;
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      long num = 1;
      boolean x;

      while(num >= 0){
         System.out.print("Enter a number: ");
         num = scan.nextLong();
         
         x = bit(num);
         
         if(x == true)
            System.out.println(num + " is an odious number");
         else
            System.out.println(num + " is an evil number");   
      }
   }
   
}