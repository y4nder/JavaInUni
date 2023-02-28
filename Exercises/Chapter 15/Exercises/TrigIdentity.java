//Exercise 2
import java.util.Scanner;
import java.lang.Math;

public class TrigIdentity{
   public static void main(String[] args){
      double angle;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Input a angle: ");
      angle = scan.nextDouble();
      //angle = angle * Math.PI/180;
      
      System.out.printf("sin(%2.2f)    is: %5.2f%n",angle, Math.sin(angle * Math.PI/180));
      System.out.printf("cos(%2.2f)    is: %5.2f%n",angle, Math.cos(angle * Math.PI/180));
      System.out.printf("sin(%2.2f)^2  is: %5.2f%n",angle, Math.pow(Math.sin(angle * Math.PI/180), 2));
      System.out.printf("cos(%2.2f)^2  is: %5.2f%n",angle, Math.pow(Math.cos(angle * Math.PI/180), 2));
      System.out.printf("sum           is: %5.2f",Math.pow(Math.sin(angle * Math.PI/180), 2) + Math.pow(Math.cos(angle * Math.PI/180), 2));
   }
}