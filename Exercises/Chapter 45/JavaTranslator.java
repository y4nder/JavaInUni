//Exercise 1
//Z:/MM122/LubgubanL/jgrasp/Exercises/Chapter 45/badPascal.java
import java.io.*;
import java.util.Scanner;
public class JavaTranslator{
   public static void main(String[] args) throws FileNotFoundException{
      File file = new File("C:/Users/user/Documents/!school/2nd SEMESTER/COMPROG 2/Exercises/LubgubanL/Exercises/Chapter 45/badPascal.pas");
      Scanner scan = new Scanner(file);
      String line, str;
      
      while( scan.hasNextLine() ){
         line = scan.nextLine();
         
         if( line.contains(":=") ){
            while( line.contains(":=") ){
                  line = line.substring( 0, line.indexOf(":=") ) 
                        + " = " + line.substring( line.indexOf(":=") + 2 ) ;     
            }
            System.out.println(line);
         }
         else{
            System.out.println(line);
         }
      }
   }
}