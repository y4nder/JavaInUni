import java.util.*;
import java.text.*;
public class MatineeMovieTickets{
   public static void main(String[] args){
      final int adultPrice = 8, adultPriceMatinee = 5, childPrice = 4, childPriceMatinee = 2;
      int age, time, price;
      DecimalFormat priceform = new DecimalFormat("$0.00");
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How old are you?: ");
      age = scan.nextInt();
      
      System.out.print("What time is it? (24hr format): ");
      time = scan.nextInt();
      
      if(age < 13){
         if(time <= 1300){
            price = childPriceMatinee;
         }
         else{
            price = childPrice;
         }
      }
      else{
         if(time <= 1300){
            price = adultPriceMatinee;
         }
         else{
            price = adultPrice;
         }
      }
      System.out.println("Ticket price is " + priceform.format(price));     
   }
}