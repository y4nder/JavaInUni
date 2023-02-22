//Exercise 1

public class AverageRainfall{
   public static void main (String[] args){
      byte april = 12, may = 14, june = 8;
      float rainfall = (april + may + june)/3.0F;
      
      System.out.println("Rainfall for April: \t" + april);
      System.out.println("Rainfall for May: \t" + may);
      System.out.println("Rainfall for June: \t" + june);
      System.out.println("Average rainfall: \t" + rainfall);
   }
}

//if rainfall expression is (april+may+june)/3, result is 11.0
//if rainfall expression (april+may+june)/3.0, result is 11.33333333333

//the beginner's error was in the expression for computing the average, if it is divided by an integer it wil result as 0.0 
               //but with a floating point number like 3.0 it will compute the result with decimals 