class HelloObject{
   private String greeting1;
   private String greeting2;

   public HelloObject( String st1, String st2 ){
      greeting1 = st1;
      greeting2 = st2;
   }

   public void speak1(){
      System.out.println( greeting1 );
   }

   public void speak2(){
      System.out.println( greeting2 );
   }
}

public class HelloExercise2{
   public static void main ( String[] args ){
      HelloObject anObject = new HelloObject("Good morning World!", "Good evening World!");
      
      anObject.speak1();
      anObject.speak2(); 
   }
}