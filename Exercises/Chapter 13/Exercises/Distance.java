import java.util.*;

public class Distance{
   public static void main(String[] args){
      double seconds, distance;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the number of seconds: ");
      seconds = sc.nextDouble();
      
      distance = ( 32.174 * (Math.pow(seconds, 2.0)) )/2;  
      
      System.out.println("Distance: " + distance);
      System.out.println(5.4 * 5.4);
   }
}