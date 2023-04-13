//Exercise 4
// This program converts digits into a timer
import java.util.Scanner;
public class MicrowaveMenu{
   public static void main(String[] args){
      String time;
      boolean numeric;
      Scanner scan = new Scanner(System.in);
      
      do{  
         System.out.print("Enter cook time-> ");
         time = scan.nextLine();          // User input will be a string.
         numeric = true;
         
         try{
            Integer num = Integer.parseInt(time); // checks if the user input are numbers.
         }
         catch(NumberFormatException e){
            numeric = false;
         }
         
         if(numeric == false)
            System.out.println(">> That is not a number, try again...");
      }
      while(numeric == false);   // loop executes if the user input is not a number.
      
      System.out.print("Your time=> ");
      
      if(time.length() == 1){
         System.out.println("0:0" + time); 
      }
      if(time.length() == 2){
         System.out.println("0:" + time);
      }
      if(time.length() == 3){
         System.out.println("0" + time.charAt(0) + ":" + time.substring(1) );
      }
      if(time.length() >= 4){
         System.out.println( time.substring(0, time.length() - 2) + ":" +time.charAt(time.length() - 2) + "" + time.charAt(time.length()-1));
      }
   }
}