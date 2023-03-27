//exercise 4
public class Substrings {
   public static void main ( String [] args) {
      String str = new String("Golf is a good walk spoiled.");
      int len = str.length();
      String sub = str.substring(0, 0);
      
      System.out.println("length: " + len);     //reference for length.
      System.out.println(str);
      System.out.println(sub);
   }
}

/*
1. Make both parameters the same value.
      -
      output: null (nothing was printed).
       
2. Make the first parameter 0, and the last parameter 
   the index of the last character plus one (28 for the example).
      -
      output[error]: Exception in thread "main" java.lang.StringIndexOutOfBoundsException: 
      Range [0, 29) out of bounds for length 28.

3. Instead of using a literal 28 in the above, 
   use str.length() which will have the value 28.
      -
      output: output printed all characters up to index 28.
   
4. Change the second parameter to 29 in the above.
      -
      output [error]: Range [0, 29) out of bounds for length 28.

5. Make the first parameter negative.
      -
      output [error]: Range [-1, 28) out of bounds for length 28

6. Reverse the order of the parameters.
      -
      output: [error]: Range [28, 0) out of bounds for length 28

*/