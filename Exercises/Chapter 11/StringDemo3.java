public class StringDemo3 {
   public static void main ( String [] args) {
      String str = new String("Golf is a good walk spoiled.");
      int len = str.length();
      String sub = str.substring(len-2);
      System.out.println(sub);
   }
}

//broke the program with len+1 
   //prompt: Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Range [29, 28) out of bounds for length 28
      //out of bounds