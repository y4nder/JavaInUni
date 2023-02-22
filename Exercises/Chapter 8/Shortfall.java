public class Shortfall{
  public static void main (String[] args ){
    //short value = 35000;
    int value = 35000;
    System.out.println("A short: " +  value);
  }
}

//short value at 356 - program runs with no issue

//short value at 35000 - error --the value doesn't fit in the 16 bit data type
      /*Shortfall.java:3: error: incompatible types: possible lossy conversion from int to short
       short value = 35000;
        
        java displays an error*/
     
//int value at 3500 - program runs with no issue --- the value fits into the 32 bit data type 
 