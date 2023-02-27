//Exercise 2
public class StringLength {
   public static void main ( String [] args) {
      String str;
      int len;
      
      str = new String("t\tt");
      len = str.length();        
            
      System.out.println("The length is " + len);
      System.out.println(str);

   }
}

// if you include escape sequences in the string object, the length of it is only 1.