import java.util.Scanner;
public class Combinations{
   public static long factorial( int n )
   {
      long fct = 1;
      if( n < 0 || n > 20) return -1;
        
      for ( int j=1; j<=n; j++ ) 
         fct *= j;
        
      return fct;
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n,r;
      
      System.out.print("Enter n: ");
      n = scan.nextInt();
      System.out.print("Enter r: ");
      r = scan.nextInt();
      
      if(factorial(n) == -1 || factorial(r) == -1 || factorial(n-r) == -1){
         if(factorial(n) == -1)
            System.out.println("ERROR!: factorial of " + n + " cannot be computed.");
         if(factorial(r) == -1)
            System.out.println("ERROR!: factorial of " + r + " cannot be computed.");
         if(factorial(n-r) == -1)
            System.out.println("ERROR!: factorial of (n-r) cannot be computed.");            
      }
      else 
         System.out.println("Combination of " + n + " and " + r + " is : " 
                            + (factorial(n) / (factorial(r) * factorial(n-r)) ) );
   }  
}