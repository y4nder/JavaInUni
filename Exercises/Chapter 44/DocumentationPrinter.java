//Z:/MM122/LubgubanL/jgrasp/Exercises/Chapter 44
import java.io.*;
import java.util.Scanner;
public class DocumentationPrinter{
   public static void main(String[] args)  throws FileNotFoundException{
      String line;
      File file = new File("C:/Users/user/Documents/!school/2nd SEMESTER/COMPROG 2/Exercises/LubgubanL/Exercises/Chapter 44/MicrowaveMenu.java");      
      Scanner scan = new Scanner(file);
      
      while(scan.hasNextLine() ){
         line = scan.nextLine();
         
         if(line.contains("//") ){
            System.out.println( line.substring( line.indexOf("//") ) );        
         }
      }
   }
}