//exercise 4
//Z:/MM122/LubgubanL/jgrasp/Exercises/Chapter 45/secretFile.text
import java.io.*;
import java.util.Scanner;
public class SecretCode{
   public static void main(String[] args) throws FileNotFoundException {
      File file = new File("C:/Users/user/Documents/!school/2nd SEMESTER/COMPROG 2/Exercises/LubgubanL/Exercises/Chapter 45/secretFile.txt");
      Scanner scan = new Scanner(file);
      String phrase;
      String decodedMessage = "";
      
      phrase = scan.nextLine();
      while( scan.hasNext() ){
         int digit = Integer.parseInt( scan.next() );

         for( int i = 0; i < phrase.length(); i++ ){
            if (digit == i )
               decodedMessage += phrase.charAt(i);
         }
      }        
      System.out.println(decodedMessage);
   }
}