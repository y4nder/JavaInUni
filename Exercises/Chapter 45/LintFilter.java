import java.util.Scanner;
public class LintFilter{
   public static void main(String[] args)  throws FileNotFoundException{
      String line;
      Scanner scan = new Scanner(System.in);
      
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