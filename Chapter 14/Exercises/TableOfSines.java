import java.text.*;

public class TableOfSines{
   public static void main(String[] args){
      double deg = -90.0;
      DecimalFormat angle = new DecimalFormat("00.0 ; -00.0");
      DecimalFormat sine = new DecimalFormat("0.0##### ; -0.0#####");
      
      System.out.println(" angle       sine    ");
      System.out.println(" -----     --------");
      
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(deg * Math.PI/180)) );
      
      deg +=15;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(deg * Math.PI/180)) );
   }
}