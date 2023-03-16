//exercise 4
/*
if weight is more than 250 - cannot enter
if weight is less than 30  - cannot enter
otherwise - can enter
*/
import java.util.Scanner;
public class PieEatingContest{
   public static void main(String[] args){
      final int maxWeight = 250;
      final int minWeight = 30;
      int weight;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter your weight: ");
      weight = scan.nextInt();
      
      if(weight > maxWeight){
         System.out.println("You cannot participate in the contest.");
      }
      else{
         if(weight < minWeight){
            System.out.println("You cannot participate in the contest.");
         }
         else{
            System.out.println("You are eligible to participate in the contest.");
         }
      }
   }
}