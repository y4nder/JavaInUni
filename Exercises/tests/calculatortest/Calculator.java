public class Calculator{
    private int num1;
    private int num2;
    private String operator;

    public Calculator(int num1, int num2, String operator){
        this.num1     = num1;
        this.num2     = num2;
        this.operator = operator;
    }

    public String Result(){

        if (operator.equals("+") ) {
            Addition x = new Addition(num1, num2);
            return "sum is " + x.add();
        }
        
        else if(operator.equals("*") ){
            Multiplication y = new Multiplication(num1, num2);
            return "product is " + y.multiply();
        }   

        else if(operator.equals("/") ){
            Division l = new Division(num1, num2);
            return "quotient is " + l.divide();
        }

        else if(operator.equals("-") ){
            Subtraction z = new Subtraction(num1, num2);
            return "difference is " + z.subtract();
        }

        else return "0";
    }
}