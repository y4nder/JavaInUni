//Exercise 7
import java.util.Scanner;
public class WordTriangle{
   public static void main(String[] args){
      String word;
      int midpoint;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a word --> ");
      word = scan.nextLine();
      
      System.out.println(word);
      midpoint = (word.length() - 1) / 2;
      for(int i = 0; i < midpoint; i++ ){
         word = word.substring(0, i) + " " + word.substring(i + 1, word.length()-1);
         System.out.println(word);
      }
   }
}