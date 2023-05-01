public class input {
    public static void main(String[] args){
        Numbers get = new Numbers();
        Operator op = new Operator();
        Calculator calc = new Calculator(get.inputOne(), get.inputTwo(), op.getOperator());
        
        System.out.println( calc.Result() );
    }
}
