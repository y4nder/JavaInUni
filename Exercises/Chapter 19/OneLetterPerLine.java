//Exercise 4
import java.util.Scanner;
public class OneLetterPerLine{
   public static void main(String[] args){
      String word;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a word: ");
      word = scan.nextLine();
      
      int count = 0;
      
      while(count < word.length()){                   //length method is used to get the number of characters in the strnig
         System.out.println(word.charAt(count));      //the variabe count is used as an index for the charAt method
         count += 1;
      }
   }
}