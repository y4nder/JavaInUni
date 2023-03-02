import java.text.*;

public class TableOfSines{
   public static void main(String[] args){
      double deg = -90.0;
      int x = 15;
      DecimalFormat angle = new DecimalFormat(" 0.0 ;-0.0");
      DecimalFormat sine  = new DecimalFormat("  0.0##### ;  -0.0#####");
      
      System.out.println(" angle       sine    ");
      System.out.println(" -----     --------");
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x; //increments by x which is 15
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      
      deg +=x;
      System.out.println(" " + angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));      //line when x is equal to 0
      
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
      deg +=x;
      System.out.println(angle.format(deg) + "      " + sine.format(Math.sin(Math.toRadians(deg))));
   }
}

//I made use of the Math.sin() method
//at first I was confused of the sine output because it didn't display the right value
      //I realized that the angle had to be converted into radians,
      //the expression -- deg * Math.PI/180 converts the degrees to a radian value
      //or use Math.toRadians() method