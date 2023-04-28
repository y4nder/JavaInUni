public class Tree
{
  // instance variables
  private double x, y, z;
  private Cone branches;
  private Cylinder trunk;  
  
  // constructor
  public Tree( double trRad, double trHeight, double brRad, double brHeight, double x, double y, double z)
  {
    trunk = new Cylinder( trRad, trHeight );
    branches = new Cone( brRad, brHeight );
    this.x = x; this.y = y; this.z = z;
  }
  
  // methods
  public String toString()
  {
    double totalHeight = branches.getHeight() + trunk.getHeight();
    double width = branches.getRadius();
    return "Tree. Height: "  + totalHeight + ", width: " + width ;
  }
  
  // more methods to come ...
  
}

