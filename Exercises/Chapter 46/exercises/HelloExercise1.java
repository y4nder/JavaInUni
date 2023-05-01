class HelloObject{
   private String greeting;
   private int limit;

   public HelloObject(String st){
      greeting = st;
      limit = greeting.length();
   }

   public void speak(){
      for(int i = 0; i < limit; i++)
         System.out.println( greeting );
   }
}

public class HelloExercise1{
   public static void main ( String[] args ){
      HelloObject anObject = new HelloObject("Hello"); 
      anObject.speak();
   }
}