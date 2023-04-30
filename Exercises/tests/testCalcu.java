public class testCalcu{
    public static void main(String[] args){
        double a = 1, b = 2;

        Addition addT = new Addition(a, b);
        Stringer st = new Stringer(addT);
        System.out.println(addT+ "\n");

        Subtraction subbT = new Subtraction(a, b);
        System.out.println(subbT.toString() + "\n");
    }
}