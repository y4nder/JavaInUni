import java.util.Locale;

public class LocaleDemoTwo
{
  public static void main ( String[] args )
  {
    double value = 12345.6789 ;

    System.out.printf( Locale.FRANCE, "value = %,10.4f%n", value );  
  }
}