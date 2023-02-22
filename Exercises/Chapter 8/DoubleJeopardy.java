public class DoubleJeopardy{
  public static void main (String[] args ){
    double value = 45.2E250;
    System.out.println("A double: " +  value);
  }
}

//the output now has a decimal point. In the previous program it didn't have a decimal point.
//this is because of its floating point data type
//changing the value from 32 to 32.0 the output was still the same.

//value at 4E400 displayed an error
      /*DoubleJeopardy.java:5: error: floating-point number too large
       double value = 4E400;
                      ^
         1 error
       the range of double data type is from -1.7E308 to +-1.7E308 approximately*/
    
//value at 45.2E250 displayed 4.52E251 -- it moved the decimal place.