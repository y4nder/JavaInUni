//Exercise 2

public class Trigonometry{
   public static void main (String [] args){
      final double ANGLE = 0.5236;
      double sinx = Math.sin(ANGLE);
      double cosx = Math.cos(ANGLE);
      double sum = (sinx * sinx) + (cosx * cosx);
      System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
   }
}
