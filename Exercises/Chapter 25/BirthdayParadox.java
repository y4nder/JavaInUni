import java.util.Scanner;
public class BirthdayParadox{
   public static void main(String[] args){
      int guestNum; 
      double probability = 100;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter number of Guests: ");
      guestNum = scan.nextInt();
      
      int i,j;
      for(j = 1; j < guestNum; j++){
         probability = ( (365 - j) / 365.0 ) * 100;
      }
      
      System.out.println("guests: " + j + " probability = " + (100 -probability) + "%");
      
      for(i = 1; probability <= 50.0; i++){
         probability = ( (365 - i) / 365.0 ) * 100;
      }
      
      System.out.println("guests: " + i + " probability = " + (probability) + "%");
   }  
}