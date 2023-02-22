public class ExponentialExplosion{
  public static void main (String[] args ){
    double value = 1.8e200;
    System.out.println("e to the power value: " +  Math.exp( value ) );
  }
}

//value at 32 => 7.896296018268069E13

//value at 1.8e308 -- error - number is too large for double dataype
   /*ExponentialExplosion.java:5: error: floating-point number too large
          double value = 1.8e308;
                         ^
      1 error*/
      
//value at 5 => 0.006737946999085467
//negative value with e3 and up outputs "0.0" example -1e3 and -2e4...
//positive value with e3 and up outputs "Infinity" example 1e3 and 2e4...
