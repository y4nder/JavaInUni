/*
If wind speed is less than 3 mph then wind chill = current temperature
If the current temperature is greater than 50° F then wind chill = current temperature
otherwise, wind chill = 35.74 + 0.6215*temp - 35.75*v0.16 + 0.4275*temp*v0.16 */

//exercise 6
import java.util.Scanner;
import java.lang.Math;
public class WindChillIndex{
   public static void main(String[] args){
      int windSpeed, temperature;
      double windChill;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Wind Speed: ");
      windSpeed = scan.nextInt();
      
      System.out.print("Enter Temperature: ");
      temperature = scan.nextInt();
            
      if(windSpeed < 3){
         windChill = temperature;
      }
      else{
         if(temperature > 50){
            windChill = temperature;
         }
         else{
            windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
         }
      }
      
      System.out.println("Wind Chill: " + windChill);  
   }
}  