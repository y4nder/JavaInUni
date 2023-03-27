//exercise 1
import java.util.Scanner;
public class InputFilePrompt{
   public static void main(String[] args){
      String fileName = "dat", ext = "dat";
      Scanner scan = new Scanner(System.in);
      
      //System.out.println("input file: ");
      //fileName = scan.nextLine();
      
      Scanner sc = new Scanner(fileName);

      int index = fileName.lastIndexOf('.');
      System.out.println(index);

            
      if(index >= 1){
      
         String extension = fileName.substring(index + 1);
         fileName = fileName.substring(0, index );
         
         if (extension.equals(ext)){
            
         }
         else{
            System.out.println("file name must end with .dat");
         }
      }
      else{
         System.out.println("File name missing,");
      }
      
      
   }
}