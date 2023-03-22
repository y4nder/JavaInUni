import java.util.Scanner;
public class StringSwitcher
{
  public static void main ( String[] args ) 
  {
    String word;
    char   color  ;    
    String message = "Phrase is: ";
    
    Scanner scan = new Scanner( System.in );

    System.out.print("Enter Acronym: ");
    word = scan.nextLine().trim().toUpperCase();
    
    String phrase = scan.hasNext(word);
    
    switch ( phrase )
    {
      case "LOL":
        message = message + "Laugh Out Loud" ;
        break;
               
      case "BFF":
        message = message + "Best Friends Forever" ;
        break;
               
      case "SO":
        message = message + "Significant Other" ;
        break;
              
      case "THS":                  
      case "THKS":                  
      case "TX":                  
        message = message + "Thanks" ;
        break;
                           
      default:
        message = message + "unknown" ;
            
    }

    System.out.println ( message ) ;
  }
}