import java.io.*;
import java.util.Scanner;
public class BetterDocumentationPrinter{
   public static void main(String[] args)  throws FileNotFoundException{
      String line;
      boolean commentFound = false;
      File file = new File("Z:/MM122/LubgubanL/jgrasp/Exercises/Chapter 10/AverageRainfall.java");      
      Scanner scan = new Scanner(file);
      
      while(scan.hasNextLine() ){
         line = scan.nextLine();
         
         if(line.contains("//") ){
            int index = line.indexOf('/');
            System.out.println(line.substring(index));        
         }
         
         if(line.contains("/*")){
            commentFound = true;
         }
         
         if(commentFound == true){
            System.out.println(line);
         }
         
         if(line.contains("*/")){
            commentFound = false;
         }
      }
   }
}