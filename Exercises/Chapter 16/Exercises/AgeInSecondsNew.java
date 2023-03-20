import java.util.*;
import java.text.*;  
public class AgeInSecondsNew{
   public static void main(String[] args){
      int years, month, totalDays;
      long seconds;
      double percent;
      Scanner sc = new Scanner(System.in);
      DecimalFormat numform = new DecimalFormat(); //to display grouped numbers
      DecimalFormat decform = new DecimalFormat("0.00"); //to format the percentage 
      
      System.out.print("How old are you in years?: ");
      years = sc.nextInt();
      
      System.out.print("How many months has passed by? (1-12): ");
      month = sc.nextInt();
      
      System.out.print("What day is it in the month?: ");
      totalDays = sc.nextInt();
      
      totalDays += years * 365;
      
      if(month >= 1)
         totalDays += 31;
      if(month >= 2)
         totalDays += 28;
      if(month >= 3)
         totalDays += 31;
      if(month >= 4)
         totalDays += 30;
      if(month >= 5)
         totalDays += 31;
      if(month >= 6)
         totalDays += 30;
      if(month >= 7)
         totalDays += 31;
      if(month >= 8)
         totalDays += 31;
      if(month >= 9)
         totalDays += 30;
      if(month >= 10)
         totalDays += 31;
      if(month >= 11)
         totalDays += 30;
      if(month >= 12)
         totalDays += 31;
          
      seconds = totalDays * 24L * 60L * 60L;
      System.out.println("\nYou are " + numform.format(seconds) + " seconds old"); 
      
      percent = (100 * seconds)/2.5E9;
      System.out.println("and you have lived " + decform.format(percent) + "% of the expected human lifespan!");
   }
}