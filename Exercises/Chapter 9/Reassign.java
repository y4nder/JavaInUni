//Exercise 3

public class Reassign{
   public static void main (String [] args){
      double x = 0.0;
      double value = 3 * (x * x) - 8 * x + 4;
      System.out.println("At x = " + x + " the value is " + value);
      
      x = 2.0;
      value = 3 * (x * x) - 8 * x + 4;
      System.out.println("At x = " + x + " the value is " + value);
      
      x = 4.0;
      value = 3 * (x * x) - 8 * x + 4;
      System.out.println("At x = " + x + " the value is " + value);
   }
}

//I copied the expression for value in line 10 to line 14 to reassign the value for x.