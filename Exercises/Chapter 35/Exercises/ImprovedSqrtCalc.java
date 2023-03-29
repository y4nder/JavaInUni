//Exercise 2
import java.util.Scanner;
public class ImprovedSqrtCalc{
   public static void main(String[] args ){
      String chars;
      double x;
      Scanner scan = new Scanner(System.in);
      
      do{
      
         do{
            System.out.print("Enter a number--> ");
            x = scan.nextDouble();
            
            if(x < 0){
               System.out.println(">>>number must be positive<<<");
            }
         }
         while(x < 0);
         
         System.out.println("Square root of " + x + " is " + Math.sqrt( x ) );
         
         do{
            System.out.print("Do you wish to continue? (yes or no) --> "); 
            chars = scan.next().toUpperCase();
            
            if(( !chars.equals("YES") && !chars.equals("NO") )){
               System.out.println(">>>Please respond with (yes or no)<<<");
            }
         }
         while( !chars.equals("YES") && !chars.equals("NO") );
      }
      while(chars.equals("YES"));
      
      System.out.println("Bye");
   }
}