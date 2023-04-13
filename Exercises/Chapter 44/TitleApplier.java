import java.util.Scanner;
public class TitleApplier{
   public static void main(String[] args){
      String name = "";
      Scanner scan = new Scanner(System.in);
      
      do{
         System.out.println("Enter a name: ");
         name = scan.nextLine();
         
         if(name.toLowerCase().startsWith( "AMY".toLowerCase() ) ||
            name.toLowerCase().startsWith( "BUFFY".toLowerCase() ) ||
            name.toLowerCase().startsWith( "CATHY".toLowerCase() ) )
            {
               System.out.println("Ms. " + name);
            }
            
         else if(name.toLowerCase().startsWith( "ELROY".toLowerCase() ) ||
                 name.toLowerCase().startsWith( "FRED".toLowerCase() ) ||
                 name.toLowerCase().startsWith( "GRAHAM".toLowerCase() ) )
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