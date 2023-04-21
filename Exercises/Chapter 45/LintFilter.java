//Exercise 2
//Z:/MM122/LubgubanL/jgrasp/Exercises/Chapter 45/BigProblems.java
import java.io.*;
import java.util.Scanner;
public class LintFilter{
   public static void main(String[] args)  throws FileNotFoundException{
      File file = new File("C:/Users/user/Documents/!school/2nd SEMESTER/COMPROG 2/Exercises/LubgubanL/Exercises/Chapter 45/BigProblems.java");
      String line;
      Scanner scan = new Scanner(file);
      
      while( scan.hasNextLine() ){
         line = scan.nextLine();
         
         if( line.trim().startsWith("if") || line.trim().contains("while") ){
            if( line.contains(" = ") ){
               System.out.println(line);
            }
         }
            
      }
   }
}  