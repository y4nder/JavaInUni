import java.util.Scanner;
public class Operator {
    private String op;
    Scanner scan = new Scanner(System.in);
    
    public String getOperator(){
        do{
            System.out.print("Enter operator: ");
            op = scan.nextLine();
        }
        while(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") );
        
        return op;
    }
}
