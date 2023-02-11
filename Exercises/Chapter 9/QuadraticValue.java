//Exercise 2

public class QuadraticValue{
   public static void main (String [] args){
      double x = 2/3.;
      double value = 3 * x * x - 8 * x + 4;
      System.out.println("At x = " + x + " the value is " + value);
   }
}

//at x = 4.0E200 the value was "infinity"
//at x = 4.0E400 -- error input was too large
//At x = (2/3) 0.0 the value is 4.0
//At x = 2.0 the value is 0.0
//At x = 2/3. the value is 0.0