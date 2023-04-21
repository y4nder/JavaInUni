import java.util.Scanner;
class HelloObject{
   private String greeting;
   Scanner scan = new Scanner(System.in);

   public HelloObject()
   {
      System.out.print("Enter Greeting: ");
      greeting = scan.nextLine();
   }

   public void speak(){
      System.out.println( greeting );
   }
}

public class HelloExercise3{
   public static void main ( String[] args ){
      HelloObject anObject = new HelloObject(); 
      anObject.speak();
   }
}