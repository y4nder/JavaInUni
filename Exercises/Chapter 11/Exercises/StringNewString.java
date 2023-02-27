//exercise 3
public class StringNewString {
   public static void main ( String [] args ) {
      String first = new String ("\t\tOne     Two Three Four\t\t");
      int len1 = first.length();
      
      String second = first.trim();
      int len2 = second.length();      
      
      System.out.println(first);
      System.out.println("The length of the first string is " + len1);
      
      System.out.println(second);
      System.out.println("The length of the second string is " + len2);
   }
}
//.trim() works on spaces and also the tab escape sequence \t.
// after doing .trim() on string first, the length of the string was also reduced. 
            //from 26 to 22.