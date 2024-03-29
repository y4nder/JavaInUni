//exercise 1
import java.util.Scanner;
public class InputFilePrompt{
   public static void main(String[] args){
      String fileName, ext = "dat", extension;
      boolean correctName = false;
      Scanner scan = new Scanner(System.in);
      
      do{
         System.out.print("input file: ");
         fileName = scan.nextLine();
         int index = fileName.lastIndexOf('.');
         
         if(index <= -1){
            System.out.println(">>>file name must end with .dat<<<");
         }      
         else{
            extension = fileName.substring(index + 1);
            fileName = fileName.substring(0, index );
            
            if (extension.equals(ext)){
               fileName = fileName.trim();
               
               if (fileName.equals("")){
                  System.out.println(">>>file name missing<<<");
               }
               else if(fileName.contains(" ")){
                  System.out.println(">>>file must not contain spaces<<<");
               }
               else{
                  System.out.println("OK");
                  correctName = true;
               }            
            }
            else{
               System.out.println(">>>file name must end with .dat<<<");
            }
         }         
      }
      while(correctName == false);
   }
}