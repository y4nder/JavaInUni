import java.util.Scanner;
public class TownDump{
   public static void main(String[] args){
      final int addCHARGE = 8;
      int pound, add; 
      double total=0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Input weight of trash in pounds: ");
      pound = scan.nextInt();
      
      if(pound > 200){
         total += ( (pound - 200) / 100 ) * addCHARGE;
         pound = 200;
      }
      
      total += pound/10.0;
      
      System.out.println("Payment Amount: $" + total);
          
   }
}