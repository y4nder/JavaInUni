//exercise 4
import java.util.Scanner;
public class RepeatEcho{
   public static void main(String[] args){
      String word;
      int times;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a word: ");
      word = scan.nextLine();
      
      times = word.length();
      
      int count = 0;
      
      while(count < times){
         System.out.println(word);
         count = count + 1;
      }
   }
}