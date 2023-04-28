public class Calculator{

    private Addition ad;

    public Calculator(double a, double b){
        ad = new Addition(a, b);
    }

    public String toString(){
        return "sum is " + ad;
    }
}
