public class ConvCodes
{
  public static void main ( String[] args )
  {
    boolean r = true;
    char b = 'B';
    int adrs = 221;
    long date = 1666;
    double x = -875612.0014;
    String fire = "Great Fire:";
    
    System.out.printf("Roses are Red:%10b%n", r);
    System.out.printf("Answer to Question 1:%5c%n", b);
    System.out.printf("Sherlock Lived at:%3d%c%n", adrs, b);
    System.out.printf("%s %d%n", fire, date);
    System.out.printf("Usual format: %8.3f Scientific format: %8.3e%n", x, x);
  }
}