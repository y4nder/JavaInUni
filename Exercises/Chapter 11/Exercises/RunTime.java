//Exercise 1
public class RunTime {
   public static void main ( String [] args ) {
      String str = new String("Hello World");
      System.out.println(str);
      
      String secondVariable = "Goodbye World";
      String newSub = secondVariable.substring(4);
      int lensec = secondVariable.length(); 
      System.out.println(secondVariable);
      System.out.println(lensec);
      System.out.println(newSub);
   }
}