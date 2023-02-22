import java.util.*;

public class Distance{
   public static void main(String[] args){
      double seconds, distance;
      Scanner sc = new Scanner(System.in);
      
      //System.out.print("Enter the number of seconds: ");
      //seconds = sc.nextDouble();
      
      double T = 100*10;            
      double Tt = T * T;  
      double Tc = Tt * 0.01;  // input is now 2 decimal places
      
      
      double tcc = Tc * 32.174;
      double t2 = tcc/2;

      System.out.println(Tt);
      System.out.println(Tc);
      System.out.println(tcc);
      System.out.println(t2); 
   }
}