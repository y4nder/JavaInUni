//Exercise 1
public class CharacterCounter{
   public static void main(String[] args){
      String word = "fjaijeoi*(EUFUEFEOIFLEuf)e(suf2190";     // initialize string with a string literal;
      int length = word.length();         // get the length of the string
      int vowel = 0, consonant = 0, punctuation = 0, specialChar = 0, digit = 0; ; //initialize the values of vowel, consonant, punctuation, special characters, and digits.
      char letter;                        // declare a variable to store single characters
      
      // program will loop according to the string's length
      for(int i = 0; i < length; i++){
         letter = word.charAt(i);         //store the character of string word in index i to letter
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
      System.out.println("The string \"" + word + "\" contains: ");
      System.out.println(vowel + " Vowels");
      System.out.println(consonant + " Consonants");
      System.out.println(punctuation + " Punctuations");
      System.out.println(specialChar + " Special Characters");
      System.out.println(digit + " digits");   
   }
}