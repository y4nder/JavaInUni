import java.util.Scanner;

public class SubstringFun {
   public static void main ( String [] args ) {
      Scanner sc = new Scanner(System.in);
      
      String originalString;
      int firstIndex, lastIndex;
      
      System.out.println("Enter a string: ");
      originalString = sc.nextLine();
      
      System.out.print("Enter beginning index: ");
      firstIndex = sc.nextInt();
      
      System.out.print("Enter ending index: ");
      lastIndex = sc.nextInt();
      
      String newString = originalString.substring( firstIndex , lastIndex);
      
      System.out.println("\nOriginal string: \n" + originalString);
      System.out.println("\nSubstring: \n" + newString);
      
   }
}