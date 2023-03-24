//exercise 1
import java.util.Scanner;
public class InputFilePrompt{
   public static void main(String[] args){
      String fileName, ext = "*.dat";
      Scanner scan = new Scanner(System.in);
      
      System.out.println("input file: ");
      fileName = scan.nextLine();
      
      Scanner sc = new Scanner(fileName);
      
      if(sc.hasNext(ext)){
         System.out.println("extension name found");
      }
      else
         System.out.println("no extension name");
      
      
   }
}