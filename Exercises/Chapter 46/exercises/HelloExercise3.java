import java.util.Scanner;
class HelloObject{
   private String greeting;
   
   public HelloObject(String message)
   {
      greeting = message;
   }

   public void speak(){
      System.out.println( greeting );
   }
}

public class HelloExercise3{
   public static void main ( String[] args ){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter Greeting: ");
      HelloObject anObject = new HelloObject( scan.nextLine() ); 
      anObject.speak();
   }
}