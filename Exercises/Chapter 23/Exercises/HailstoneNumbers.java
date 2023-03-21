import java.util.Scanner;
public class HailstoneNumbers{
   public static void main(String[] args){
      long firstValue, nextValue = 0, n, maximum;
      Scanner scan = new Scanner(System.in);
      
      //input initial value
      System.out.print("Enter initial value: ");
      firstValue = scan.nextInt();
      maximum = firstValue;                     //maximum integer is first initialized as the initial value.
      
      int count = 0;
      while(nextValue != 1){                    //nextValue is initialized as 0 so the loop will execute.
         
         //if-else statement checks if initial value is even or odd
         if(firstValue % 2 == 0){
            n = firstValue/2;    //executed if even
         }
         else{
            n = 3 * firstValue + 1; //executed if odd
         }
         
         //update variables to prepare for next loop.
         nextValue = n;
         firstValue = nextValue;         
         
         //value of n is stored in variable maximum if maximum is less than n
         if(maximum < n){
            maximum = n;
         }
         count++;       
      }
      
      //display of the highest integer in lenght of sequence
      System.out.println("Sequence length: " + (count+1) );
      System.out.println("Maximum integer in sequence: " + maximum );      
   }
}