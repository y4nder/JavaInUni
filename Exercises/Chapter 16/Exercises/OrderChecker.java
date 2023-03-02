import java.util.Scanner;

public class OrderChecker{
   public static void main(String[] args){
      final int boltPrice = 5;
      final int nutPrice = 3;
      final int washerPrice = 1;
      int bolt, nut, washer, total;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Number of bolts: ");
      bolt = scan.nextInt();
      
      System.out.print("Number of nuts: ");
      nut = scan.nextInt();
      
      System.out.print("Number of washers: ");
      washer = scan.nextInt();
      
      if(nut < bolt){
         if (washer < (bolt * 2)){
            System.out.println("Check the Order: too few nuts");
            System.out.println("Check the Order: too few washers");
         }
         else{
            System.out.println("Check the Order: too few nuts");
         }
      }
      else{
         if(washer < (bolt * 2)){
            System.out.println("Check the Order: too few washers");
         }
         else{
            System.out.println("Order is OK");
         }
      }
      
      
      total = (bolt * boltPrice) + (nut * nutPrice) + (washer * washerPrice);
      
      System.out.println("Total cost: " + total);
   }
}