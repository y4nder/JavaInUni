import java.util.Scanner;
public class MicrowaveMenu{
   public static void main(String[] args){
      String time;
      boolean numeric;
      Scanner scan = new Scanner(System.in);
      
      do{  
         System.out.print("Enter cook time-> ");
         time = scan.nextLine();          //User input will be a string.
         numeric = true;
         
         try{
            Integer num = Integer.parseInt(time); //checks if the user input are numbers.
         }
         catch(NumberFormatException e){
            numeric = false;
         }
         
         if(numeric == false)
            System.out.println(">> That is not a number, try again...");
      }
      while(numeric == false);   //loop executes if the user input is not a number.

         
      int digits = time.length();
      
      if(digits == 1){
         System.out.println("0:0" + time); 
      }
      if(digits == 2){
         System.out.println("0:" + time);
      }
      if(digits == 3){
         System.out.println("0" + time.charAt(0) + ":" + time.substring(1) );
      }
      if(digits >= 4){
         System.out.println( time.substring(0, digits - 2) + ":" +time.charAt(digits - 2) + "" + time.charAt(digits-1));
      }
   }
}