import java.text.*;
import java.util.Locale;

public class IODemoGermany{
   public static void main(String[] args){
      Integer i = new Integer(7654231);
      Double d = new Double(11000.0008);
      
      Locale.setDefault(Locale.GERMANY);
      DecimalFormat numform = new DecimalFormat();
      
      System.out.println("Default Locale = " + Locale.getDefault());
      System.out.println("integer = " + numform.format(i) + " double = " + numform.format(d));
   }
}

//compiling messages

/*
 IODemoGermany.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
       Integer i = new Integer(7654231);
                   ^
 IODemoGermany.java:7: warning: [removal] Double(double) in Double has been deprecated and marked for removal
       Double d = new Double(11000.0008);
*/