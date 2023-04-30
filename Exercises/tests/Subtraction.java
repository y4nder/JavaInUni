public class Subtraction{

    private double a;
    private double b;
    private double diff;

    public Subtraction(double a, double b){
        this.a = a;
        this.b = b;
        diff = subtract();
    }

    public double subtract(){
        return a - b;
    }

    public String toString(){
        return "diff is " + diff;
    }
}