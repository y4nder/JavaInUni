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

public class HelloTesterExpanded
{
  public static void main ( String[] args )  
  {
    HelloObject object1 = new HelloObject("Mercury"); 
    HelloObject object2 = new HelloObject("Venus"); 
    HelloObject object3 = new HelloObject("Earth"); 
    HelloObject object4 = new HelloObject("Mars"); 

    object1.speak();
    object2.speak();
    object3.speak();
    object4.speak();
  }
}