//exercise 1
import java.util.Scanner;
public class DiscountPrices{
   public static void main(String[] args){
      int purchase; 
      int price;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter amount of purchases: ");
      purchase = scan.nextInt();
      
      if(purchase > 1000)
         price = purchase - ( (purchase * 10) / 100 );
      else 
         price = purchase;
         
      System.out.println("Discounted price: " + price);
   }
}