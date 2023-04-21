//Exercise 4
//Z:/MM122/LubgubanL/jgrasp/Exercises/Chapter 45/verbose.text
import java.io.*;
import java.util.Scanner;
public class FileCompressor{
   public static void main(String[] args) throws FileNotFoundException{
      String line;
      File file = new File("C:/Users/user/Documents/!school/2nd SEMESTER/COMPROG 2/Exercises/LubgubanL/Exercises/Chapter 45/verbose.txt");
      Scanner scan = new Scanner(file);
      
      while( scan.hasNextLine() ){
         line = scan.nextLine();
         
         while( line.trim().toUpperCase().contains(" A ") || line.trim().toUpperCase().contains(" THE ")
             || line.trim().toUpperCase().startsWith("A ") || line.trim().toUpperCase().startsWith("THE") ){
               
               if( line.trim().toUpperCase().startsWith("A ") ){
                  line = line.substring( line.toUpperCase().indexOf("A") + 2).trim();
               }

               if( line.trim().toUpperCase().startsWith("THE ") ){
                  line = line.substring( line.toUpperCase().indexOf("THE") + 3).trim();
               }
             
               if( line.trim().toUpperCase().contains(" A ") ){
                  line = line.substring(0, line.toUpperCase().indexOf(" A ") ) + " " + line.substring(line.toUpperCase().indexOf(" A ") + 3 );
               }
               
               if( line.trim().toUpperCase().contains(" THE ") ){
                  line = line.substring(0, line.toUpperCase().indexOf(" THE ") ) + " " + line.substring(line.toUpperCase().indexOf(" THE ") + 5 );
               }
         }
         System.out.println(line);
      }
   }
}