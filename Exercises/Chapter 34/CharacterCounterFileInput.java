//Exercise 2
import java.util.Scanner;
import java.text.DecimalFormat;
public class CharacterCounterFileInput{
   public static void main(String[] args){
      String word;     
      int length;     
      int vowel = 0, consonant = 0, punctuation = 0, specialChar = 0, digit = 0; 
      char letter;
      Scanner scan = new Scanner(System.in);
      DecimalFormat percent = new DecimalFormat("0.00%");
      
      System.out.print("Enter String: ");
      word = scan.nextLine();      
      
      length = word.length();                    
      
      for(int i = 0; i < length; i++){
         letter = word.charAt(i);         
         switch (letter){
            case 'a': case 'e': case 'i': case 'o': case 'u':
               vowel++; 
               break;
            case '.': case ',': case ':': case ';': case '?': case '!': case '-': case '(': case ')': case '[': case ']': case '\'':
               punctuation++; 
               break;
            case '$': case '%': case '_': case ' ': case '#': case '^': case '*': case '`': case '+':
               specialChar++; 
               break;
            case '1': case '2':  case '3':  case '4':  case '5':  case '6':  case '7':  case '8':  case '9':  case '0':
               digit++;
               break;  
            default:
               consonant++; 
               break;
         }
      }
      
      System.out.printf("%-1d  %-15s %15s \n", vowel, "Vowels", (percent.format((vowel + 0.0)/length)) );
      System.out.printf("%-1d  %-15s %15s \n", consonant, "Consonants", (percent.format((consonant + 0.0)/length)) );
      System.out.printf("%-1d  %-15s %15s \n", punctuation, "Punctuations", (percent.format((punctuation + 0.0)/length)) );
      System.out.printf("%-1d  %-15s %12s \n", specialChar, "Special Characters", (percent.format((specialChar + 0.0)/length)) );
      System.out.printf("%-1d  %-15s %15s ", digit, "digits", (percent.format((digit + 0.0)/length)) );
   }
}