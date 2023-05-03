import java.util.Scanner;
public class OdiousNumbers{
   public static boolean checkBits(long num){
      int oddCount = 0;
      for( ; num > 0; num = num / 2)
         if(num % 2 == 1) oddCount++;

      return oddCount % 2  == 0? false : true;
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      long num;

      System.out.println("To exit, enter a negative value");
      do{
         System.out.print("Enter a number: ");
         num = scan.nextLong();
         if(num < 0) break;

         System.out.print(num + " is an ");
         System.out.println( (checkBits(num) == true)? "odious number" : "evil number");
      }
      while(num >= 0);
   }
   
}