class HelloObject{
   private String greeting;

   public HelloObject( String st ){
      greeting = st;
   }

   public HelloObject( HelloObject init ){
      greeting = new String (init.greeting);
   }

   public void speak(){
      System.out.println( greeting );
   }
}

public class HelloExercise4{
   public static void main ( String[] args ){
      HelloObject anObject1 = new HelloObject("Hello");
      anObject1.speak();
      
      HelloObject anObject2 = new HelloObject(anObject1);
      anObject2.speak();      
   }
}
