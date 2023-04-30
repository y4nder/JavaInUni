public class Addition {
    private double a;
    private double b;
    private double sum;
    private double diff;

    public Addition(double a, double  b){
        this.a = a;
        this.b = b;
        sum = add();
    }

    public double add(){
        return a + b;
    }

    public String toString()
    {
      return "sum "  + sum;
    }
}
