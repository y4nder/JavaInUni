public class CharAssassination
{
  public static void main ( String[] args )
  {
    char ch = "A";
    System.out.println("A char: " +  ch );
  }
}

// char ch = 'A' -- output: A

// char ch = 'AA' -- error 
      /*CharAssassination.java:5: error: unclosed character literal
        char ch = 'AA' ;
                ^
         it expected a quotation next to the first A*/
         
         
// char ch = ' ' -- output: 

// char ch = '' (no space) -- error
      /*CharAssassination.java:5: error: empty character literal
       char ch = '' ;
                 ^
      1 error*/

//char ch = "A";
      /*CharAssassination.java:5: error: incompatible types: String cannot be converted to char
       char ch = "A" ;
                ^
      1 error*/


//the char datatype only accepts one character, if it is given more than one it will expect a missing single quote for the first character.
//if it is initialized with a space ' ', it will acccept it. however it will not accept no spaces '', it will ask for a character
//if initialized with double quotes " " it will think that the input is a string and will not convert it to char