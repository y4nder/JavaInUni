class HelloObject{
   private String greeting;

   public HelloObject( String st )
   {
      greeting = st;
   }

   public void speak(){
      System.out.println( greeting );
   }
}

public class HelloExercise2{
   public static void main ( String[] args ){
      HelloObject anObject1 = new HelloObject("Good morning World!");
      HelloObject anObject2 = new HelloObject("Good evening World!"); 
      
      anObject1.speak();
      anObject2.speak(); 
   }
}