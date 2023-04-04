import java.util.Scanner;
public class Title{
   public static void main(String[] args){
      String name = "";
      Scanner scan = new Scanner(System.in);
      
      do{
         System.out.println("Enter a name: ");
         name = scan.nextLine();
         
         if(name.toLower().startsWith("Amy") ||
            name.startsWith("Buffy") ||
            name.startsWith("Cathy") )
            {
               System.out.println("Ms. " + name);
            }
            
         else if(name.startsWith("Elroy") ||
                  name.startsWith("Fred") ||
                  name.startsWith("Graham") )
         {
            System.out.println("Mr. " + name);
         }
         else{
            System.out.println(name);
         }      
      }
      while(!name.equals(""));
      
   }
}