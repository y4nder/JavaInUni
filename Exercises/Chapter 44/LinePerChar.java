//Exercise 2
import java.util.Scanner;
public class LinePerChar{
   public static void main(String[] args){
      String word;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a string: ");
      word = scan.nextLine();
       
      for(int i = 0; i < word.length(); i++){
         System.out.println(word.charAt(i));
      }
   }
}