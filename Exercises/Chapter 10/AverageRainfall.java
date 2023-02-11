//Exercise 1

public class AverageRainfall{
   public static void main (String [] args){
      int april = 12, may = 14, june = 8;
      double rainfall = (april + may + june)/3.0;
      
      System.out.println("Rainfall for April: \t" + april);
      System.out.println("Rainfall for May: \t" + may);
      System.out.println("Rainfall for June: \t" + june);
      System.out.println("Average rainfall: \t" + rainfall);
   }
}

//if the rainfall is (ap+may+june)/3, result is 11.0
//if the rainfall is (ap+may+june)/3.0, result is 11.33333333333