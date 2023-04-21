class HelloObject                                  
{
  private String greeting;

  public HelloObject( String st )
  {
    greeting = st;
  }

  public void speak()                                     
  { 
    System.out.println( greeting );
  }
}

public class HelloTesteWthConstructor
{
  public static void main ( String[] args )        
  {
    HelloObject anObject = new HelloObject("A Greeting!"); 
    anObject.speak();
  }
}