//exercise 3
import java.util.Scanner;
public class InternetAcronyms{
   public static void main (String[] args ){
      String phrase, text; 
      String message = "Interpretation: ";
      int exit = 0;
      Scanner scan = new Scanner( System.in );
      
      System.out.println("Enter a message that has Internet Acronyms. (type \"quit\" to exit)");
      System.out.print("Enter your message: ");
      phrase = scan.nextLine().trim().toUpperCase();
      
      if(phrase.equals("QUIT"))
         exit = 1;
               
      Scanner scanner = new Scanner(phrase);                   
      
      while( exit == 0 ){
         while( scanner.hasNext() ){                              
            switch ( text = scanner.next() ){                     
               case "LOL":
                 message = message + "Laugh Out Loud " ;
                 break;
                                        
               case "BFF":
                 message = message + "Best Friends Forever " ;
                 break;
                        
               case "SO":
                 message = message + "Significant Other " ;
                 break;
                       
               case "THS": case "THKS": case "TX":                  
                 message = message + "Thanks " ;
                 break;
               
               case "SML":
                  message = message + "Share mo lang ";
                  break;
                  
               case "SKL":
                  message = message + "Share ko lang ";
                  break;
               
               case "SLR":
                  message = message + "Sorry Late Reply ";
                  break;
                  
               case "TTYL":
                  message = message + "Talk To You Later ";
                  break;
                  
               case "GM":
                  message = message + "Good Morning ";
                  break;
               
               case "GN":
                  message = message + "Good Night ";
                  break;
                  
               case "IMY":
                  message = message + "I Miss You ";
                  break;
                  
               case "ASAP": case "A.S.A.P":
                  message = message + "As Soon As Possible ";
                  break;
                  
               case "WTF":
                  message = message + "What the Fuck ";
                  break;
                  
               case "WTH":
                  message = message + "What the heck ";
                  break;
                  
               case "WYD":
                  message = message + "What you doin' ";
                  break;
                  
               case "WYA":
                  message = message + "Where you at " ;
                  break;
               
               default:
                 message = message + text.substring(0,1) + text.substring(1).toLowerCase() + " ";
                 break;         
            }
         }
         
      System.out.println (message);
      message = "Interpretation: ";
      
      System.out.print("\nEnter your message: ");
      phrase = scan.nextLine().trim().toUpperCase();
      scanner = new Scanner(phrase); 
      
      if(phrase.toUpperCase().equals("QUIT"))
         exit = 1;
      }
      
      if (exit == 1)
         System.out.println("Goodbye."); 
   }
}