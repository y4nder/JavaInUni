//exercise 3
import java.util.Scanner;
public class WordsSeparatedByDots{
   public static void main(String[] args){
      String word1, word2;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the first word: ");
      word1 = scan.nextLine();
      
      System.out.print("Enter the second word: ");
      word2 = scan.nextLine();
      
      int times = 30 - ( word1.length() + word2.length() ); 
      
      System.out.print(word1);
      
      int count = 1;
      while(count < times){
         System.out.print(".");
         count = count + 1;
      }
      
      System.out.print(word2);
      
   }
}
