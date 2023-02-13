//Exercise 2

public class Trigonometry{
   public static void main (String [] args){
      final double ANGLE = 0.5155;
      int sinx = Math.sin(ANGLE);
      int cosx = Math.cos(ANGLE);
      double sum = (sinx * sinx) + (cosx * cosx);
      System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
   }
}

//method math.sin and math.cos accepts integers in its paramaters but the result cannot be stored in an integral datatype