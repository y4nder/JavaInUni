import java.util.Locale;
import java.text.*;

public class IODemo{
   public static void main(String[] args){
      int value = 123456789;
      
      System.out.println("Default Locale = " + Locale.getDefault());
      DecimalFormat decform = new DecimalFormat();
      System.out.println("value = " + decform.format(value));
   }
}