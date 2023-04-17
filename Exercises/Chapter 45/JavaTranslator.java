import java.util.Scanner;
public class JavaTranslator{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
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