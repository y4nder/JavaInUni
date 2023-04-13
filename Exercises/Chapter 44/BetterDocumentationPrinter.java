//Exercise 5.2
//locations
   //Z:/MM122/LubgubanL/jgrasp/Exercises/Chapter 10/AverageRainfall.java
   //C:/Users/user/Documents/!school/2nd SEMESTER/COMPROG 2/Exercises/LubgubanL/Exercises/Chapter 10/AverageRainfall.java
import java.io.*;
import java.util.Scanner;
public class BetterDocumentationPrinter{
   public static void main(String[] args)  throws FileNotFoundException{
      String line;
      boolean commentFound = false;
      File file = new File("C:/Users/user/Documents/!school/2nd SEMESTER/COMPROG 2/Exercises/LubgubanL/Exercises/Chapter 10/AverageRainfall.java");      
      Scanner scan = new Scanner(file);
      
      while(scan.hasNextLine() ){
         line = scan.nextLine();
         
         if( commentFound == true && !line.contains("*/") ){
            System.out.println( line.trim() );
         }
         
         if(line.contains("//") ){
            System.out.println( line.substring( line.indexOf("//") ) );        
         }
         
         if( line.contains("/*") ){
            if( line.contains("*/") ){
               System.out.println( line.substring( line.indexOf("/*"), line.indexOf("*/") + 2 ) );
            }
            else{
               commentFound = true;
               System.out.println( line.substring( line.indexOf("/*") ) );
            }           
         }
         else{
            if( line.contains("*/") ){
               commentFound = false;
               System.out.println( line.substring(0, line.indexOf("*/") + 2).trim() );
            }
         }
      }
   }
}