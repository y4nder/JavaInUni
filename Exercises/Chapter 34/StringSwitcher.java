import java.util.Scanner;
public class StringSwitcher
{
  public static void main ( String[] args ) 
  {
    String phrase;   
    String message = "Phrase is: ";
    
    Scanner scan = new Scanner( System.in );

    System.out.print("Enter Acronym: ");
    phrase = scan.nextLine().trim().toUpperCase();
    Scanner scanner = new Scanner(phrase);
    String text;

    while(scanner.hasNext()){
      switch (text = scanner.next())
      { 
         case "LOL":
           message = message + "Laugh Out Loud " ;
           break;
                  
         case "BFF":
           message = message + "Best Friends Forever " ;
           break;
                  
         case "SO":
           message = message + "Significant Other " ;
           break;
                 
         case "THS":                  
         case "THKS":                  
         case "TX":                  
           message = message + "Thanks " ;
           break;
                              
         default:
           message = message + " " + text + " " ;
           break;         
      }
    }

    System.out.println (message) ;
  }
}