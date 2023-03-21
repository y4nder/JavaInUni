import java.util.Scanner;
public class AddSquaresAndCubes{
   public static void main(String[] args){
      int n, prodSq, prodCb, sumSq = 0, sumCb = 0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Upper limit: ");
      n = scan.nextInt();           //User input for limit
      
      int base = 1;       
      while(base <= n){             //the while loop expression iterates the base up to the limit (1 to n)
         prodSq = base * base;      //expression for getting the square
         sumSq += prodSq;           //expression for adding the squared results
   
         prodCb = base * base * base;  //expression for getting the cube
         sumCb += prodCb;              //expression for adding the cubed results
         
         base++;
      }
      
      System.out.println("Using explicit summations:");
      System.out.println("\tThe sum of Squares is " + sumSq);
      System.out.println("\tThe sum of Cubes   is " + sumCb);
      
      sumSq = n * (n+1) * (2 * n+1) /6;         //mathematical formula for adding squares
      sumCb = (n*n) * ( (n+1) * (n+1) )/4;      //mathematical formula for adding cubes
      
      System.out.println("Using Formula: ");
      System.out.println("\tThe sum of Squares is " + sumSq);
      System.out.println("\tThe sum of Cubes   is " + sumCb);
   }
}