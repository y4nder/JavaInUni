import java.util.Scanner;
public class PerfectNumbers {
    public static boolean isPerfect(int num){
        int x = 0;
        for(int i = 1; i < num; i++)
            if(num % i == 0) x += i;

        return x == num? true : false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = scan.nextInt();

        String x = isPerfect(num) == true? " is a perfect number" : " is not a perfect number";
        System.out.println(num + x);
    }
}
