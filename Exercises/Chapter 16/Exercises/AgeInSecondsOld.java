//exercise 7
/*
convert to totalDaysays
   totalDays = 365 * years + totalDays
   month 
      month 1 - 6  {31, 28+2, 31,   30,   31,   30} 
      month 7 - 12 {31, 31-1, 30+1, 31-1, 30+1, 31-1}
      
      odd (31)     = 1, 3, 5, 7, 9, 11  = 186 days
      even(30)(-1) = 2, 4, 6, 8, 10, 12 = 179 days 
                                        = 365 days
      
      if month == 2 : days - 2 ----extra conditions to compensate with the table above.
      if month >= 8 : days + 1 -------
*/
import java.util.*;
import java.text.*;  
public class AgeInSecondsOld{
   public static void main(String[] args){
      int years, months, totalDays;
      long seconds;
      double percent;
      Scanner sc = new Scanner(System.in);
      DecimalFormat numform = new DecimalFormat(); //to display grouped numbers
      DecimalFormat decform = new DecimalFormat("0.00"); //to format the percentage 
      
      System.out.print("How old are you in years?: ");
      years = sc.nextInt();
      
      System.out.print("How many months has passed by? (1-12): ");
      months = sc.nextInt();
      
      System.out.print("What day is it in the month?: ");
      totalDays = sc.nextInt();
      
      totalDays += years * 365;
          
      if(months % 2 == 0){ //this if statement becomes true if the month is even
         if(months >= 2)
            totalDays += -2;    // february has 28 days so 2 days will be deducted
         if(months >=8)
            totalDays += 1;      // 1 day is added since August has 31 days.
         if(months == 2)
            totalDays += 30 * months + 1; //explanation: The even months has a base of 30 days, while the odd months has a base of 31 days ..              
         if(months == 4)
            totalDays += 30 * months + 2;          //30 is multiplied by the month, then an extra expression is added to add the extra days of the previous odd months.
         if(months == 6)
            totalDays += 30 * months + 3;
         if(months == 8)
            totalDays += 30 * months + 4;
         if(months == 10)
            totalDays += 30 * months + 5;
         if(months == 12)
            totalDays += 30* months + 6;
      }
      else{    //this else statement runs if the input month is odd
         if(months >=8)
            totalDays += 1;      // 1 day is added since August has 31 days.
         if(months >= 2)
            totalDays += -2;    // february has 28 days so 2 days will be deducted
         if (months == 1)
            totalDays += 31 * months - 0;
         if (months == 3)
            totalDays += 31 * months - 1;
         if (months == 5)
            totalDays += 31 * months - 2;
         if (months == 7)
            totalDays += 31 * months - 3;
         if (months == 9)
            totalDays += 31 * months - 4;
         if (months == 11)
            totalDays += 31 * months - 5;
      }

      seconds = totalDays * 24L * 60L * 60L;
      System.out.println("\nYou are " + numform.format(seconds) + " seconds old"); 
      
      percent = (100 * seconds)/2.5E9;
      System.out.println("and you have lived " + decform.format(percent) + "% of the expected human lifespan!");
   }
}