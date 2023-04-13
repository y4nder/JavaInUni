//Exercise 1
import java.util.Scanner;
public class NameEcho{
   public static void main(String[] args){
      String name;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter your name: ");
      name = scan.nextLine().trim();
      
      if( name.contains(" ") ){
         int index = name.indexOf(" ");  
         System.out.println( name.substring(0, index).concat(name.substring(index).toUpperCase() ) );   
      }
      else{
         System.out.println(name);
      }
   }
}