import java.util.Scanner;
public class HailstoneNumbersVer2{
   public static void main(String[] args){
      final long limit = 50;
      long firstValue = 1, nextValue = 0, n, maxCount = 1, maxStart;
      Scanner scan = new Scanner(System.in);
      
      long countVal = firstValue;
      maxStart = firstValue;
      
      while(countVal <= limit){
         
         int count = 0;
         
         while(nextValue != 1){
            if(firstValue % 2 == 0){
               n = firstValue/2;
            }
            else{
               n = 3 * firstValue + 1;
            }
            
            count++;
            nextValue = n;
            firstValue = nextValue;

         }
         
         if( maxCount < (count + 1) ){
            maxCount = count + 1;
            maxStart = countVal;              
         }
         
         System.out.println("at value " + countVal + " possible sequences formed is " + (count+1));
         countVal++;
         firstValue = countVal;
         nextValue = 0;
         
      }
      System.out.println("From integers 1-" + limit + " the longest sequence formed is in value: " + maxStart + " which has " + maxCount + " sequences" );
   }
}