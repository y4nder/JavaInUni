import java.util.Scanner;
public class LinePerChar{
   public static void main(String[] args){
      String word;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a string: ");
      word = scan.nextLine();
      
      int length = word.length();
      
      for(int i = 0; i < length; i++){
         System.out.println(word.charAt(i));
      }
   }
}