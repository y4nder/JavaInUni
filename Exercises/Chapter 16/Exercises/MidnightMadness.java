//exercise 9
import java.util.*;
import java.text.*;
public class MidnightMadness{
   public static void main(String[] args){
      final int adultPrice = 8, adultPriceMatinee = 5, childPrice = 4, childPriceMatinee = 2, midnightTicket = 4;
      int age, time, price = 0;
      DecimalFormat priceform = new DecimalFormat("$0.00");
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How old are you?: ");
      age = scan.nextInt();
      
      System.out.print("What time is it? (24hr format): ");
      time = scan.nextInt();

      if(time > 2200){
         if(age < 13){
            System.out.println("No tickets are sold to children at this hour!");
         }
         else{
            price = midnightTicket;
            System.out.println("Ticket price is " + priceform.format(price)); 
         }    
      }            
      
      else{
         if(age < 13){
            if(time < 1700){
               price = childPriceMatinee;
            }
            else{
               price = childPrice;
            }
         }
         else{
            if(time < 1700){
               price = adultPriceMatinee;
            }
            else{
               price = adultPrice;
            }  
         }
         System.out.println("Ticket price is " + priceform.format(price));   
      } 
   }
}