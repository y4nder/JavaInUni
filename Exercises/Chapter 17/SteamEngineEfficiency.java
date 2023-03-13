import java.util.Scanner;
public class SteamEngineEfficiency{
   public static void main(String[] args){
      int tAir, tSteam;
      double efficiency;
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("Enter Air Temperature value in Kelvin: ");
      tAir = scan.nextInt();
      
      System.out.print("Enter Steam Temperature value in Kelvin: ");
      tSteam = scan.nextInt();
      
      if(tSteam < 373)
         tSteam = tAir;             //if the steam temperature is less than 373, the steam temperature will be equal to the air temperature  
                                       //so that when dividing in floating point the result will be 1, 1 - 1 will be
      efficiency = 1 - tAir / tSteam;
      
      System.out.println("Maximum efficiency of the steam engine is " + efficiency);
   }
}