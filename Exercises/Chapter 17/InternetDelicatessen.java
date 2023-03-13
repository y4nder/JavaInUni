import java.text.*;
import java.util.Scanner;
public class InternetDelicatessen{
   public static void main(String[] args){
      final int reglrDelivery = 200, exprssDelivery = 300;
      double price, delivery = 0, total = 0;
      String item;
      int finalDelivery;
      
      DecimalFormat numform = new DecimalFormat("");
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the item: ");
      item = scan.nextLine();
      
      System.out.print("Enter the price in cents: ");
      price = scan.nextDouble();
      
      System.out.print("Overnight delivery (0==no, 1==yes): ");
      finalDelivery = scan.nextInt();
      
      total += price;    

      if(price < 1000){
         delivery += reglrDelivery;
      }

      if(finalDelivery == 1){
         delivery += exprssDelivery;
      }
      
      total += delivery;
      
      System.out.println("Invoce: ");
      System.out.printf(" %-10s %10.2f\n", item, price/100);
      System.out.printf(" %-10s %10.2f\n", "delivery", delivery/100);
      System.out.printf(" %-10s %10.2f", "total", total/100);
   }
}