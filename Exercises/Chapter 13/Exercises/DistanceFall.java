import java.util.Scanner;

public class DistanceFall{
   public static void main(String[] args){
      double time, distance;
      double g = 32.174;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the number of seconds: ");
      time = scan.nextDouble();
      
      time = time * 10;                                                 
      distance = (g * ((time * time) * 0.01) / 2);
      System.out.println("Distance: " + distance);
   }
}

// Line 12 and line 13 ----- time * 10 and ((time * time) * 0.01)
/*The purpose of these extra expressions is to maintain the 2 decimal places for the variable time 
  since the double datatype will print out 13 extra decimal places..:)) 
   example: time = 5.4 squared would be 29.16 instead of 29.16000000...*/  
   
// if a brick falls in 100 seconds the distance traveled would be 160870.0 feet  