public class Multiplication(){
    private double a;
    private double b;
    private double prod;
    
    public class Multiplication(double a, double b){
        this.a = a;
        this.b = b;
        prod = multiply();
    }

    public double multiply(){
        return a * b;
    }

}