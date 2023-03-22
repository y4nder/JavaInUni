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
            case '$': case '%': case '_': case ' ':
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
      // display the number of vowel, consonants, punctuations, special character along with their percentages.
      System.out.println("The string \"" + word + "\" contains: ");
      System.out.println(vowel + " Vowels = " + percent.format((vowel + 0.0)/length) );
      System.out.println(consonant + " Consonants = " + percent.format((consonant + 0.0)/length) );
      System.out.println(punctuation + " Punctuations = " + percent.format((punctuation + 0.0)/length) );
      System.out.println(specialChar + " Special Characters = " + percent.format((specialChar + 0.0)/length));
      System.out.println(digit + " digits = " + percent.format((digit + 0.0)/length));
   }
}