import java.text.*;

public class IODemoWrapper{
  public static void main ( String[] args ){
    Integer i = 7654321 ;      // create an Integer thru autoboxing
    Double  d = 11000.0008 ;   // create a  Double  thru autoboxing
    
    DecimalFormat numform = new DecimalFormat(); 
    
    System.out.println( "integer = " + numform.format(i) + "\n double = " + numform.format(d) );
  }
}