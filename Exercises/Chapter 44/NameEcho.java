import java.util.Scanner;
public class NameEcho{
   public static void main(String[] args){
      String name, newName;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter your name: ");
      name = scan.nextLine().trim();
      
      int index = name.indexOf(" "); 
      newName = name.substring(0, index).concat(name.substring(index).toUpperCase());
      
      System.out.println(newName);
   }
}