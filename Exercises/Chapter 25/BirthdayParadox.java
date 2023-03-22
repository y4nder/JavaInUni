import java.text.DecimalFormat;
import java.util.Scanner;
public class BirthdayParadox{
   public static void main(String[] args){
      int guestNum; 
      double probability = 1;                   //initialized to 1
      Scanner scan = new Scanner(System.in);
      DecimalFormat percent = new DecimalFormat("0.0#%");
      
      //ask for input of number of guests
      System.out.print("Enter number of Guests: ");
      guestNum = scan.nextInt();
      
      int i,j; //declare counter
      
      for(j = 1; j < guestNum; j++){
         probability *= (365 - j) / 365.0 ;
      }
      
      //display probability percentage in terms of number of guests
      System.out.println("\nWith " + guestNum + " guests, the probability of no shared birthdays is " + percent.format(probability) );
      
      //threshold means at what percentage of probability should be met 
      double threshold = 0.5;
      for(i = 0; probability > threshold; i++){
         probability *= (365 - i) / 365.0 ;
      }
      
      //display needed number of guests to meet the threshold
      System.out.println(i + " guests is required in order to get " + percent.format(threshold) + " probability");
   }  
}