// TreeTester.java
//
public class TreeTester
{
  public static void main( String[] args )
  {
    double trunkR = 1.0, trunkH = 5.0, branchR = 25.0, branchH = 50.0 ;
    
    Tree myTree = new Tree( trunkR, trunkH, branchR, branchH, 1, 2, 3  );
    System.out.println("myTree: " + myTree + "\n");
  }
}
