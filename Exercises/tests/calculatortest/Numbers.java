import java.util.Scanner;
public class Numbers {
    Scanner scan = new Scanner(System.in);
    
    public int inputOne(){
        System.out.print("Enter first num: ");
        return scan.nextInt();
    }
    
    public int inputTwo(){
        System.out.print("Enter second num: ");
        return scan.nextInt();
    }
}
