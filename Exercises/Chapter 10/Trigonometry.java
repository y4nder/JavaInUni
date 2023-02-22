//Exercise 2

public class Trigonometry{
   public static void main (String[] args){
      double angle = -1;        //used a variable to easily modify the program
      double sinx = Math.sin(angle);
      double cosx = Math.cos(angle);
      double sum = (sinx * sinx) + (cosx * cosx);
      System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
   }
}

//method math.sin and math.cos accepts integers in its paramaters but the result cannot be stored in an integral datatype
// int sinx = Math.sin(angle); - error, it cannot store the result to an integer variable

//somehow all of the sum of squares is equal to 1.0;

