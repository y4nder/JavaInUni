import java.util.Scanner;
public class UnluckyEvilNumbers{
    public static boolean checkLuck(long num){
        boolean x = false;
        for( ; num > 0; num /= 10){ 
           if(x == true && num % 10 == 1) 
              return true;
           else 
              x = false;
  
           if(num % 10 == 3) x = true;
        }
  
        return false;
    } 

    public static boolean checkBits(long num){
    int oddCount = 0;
    for( ; num > 0; num = num / 2)
        if(num % 2 == 1) oddCount++;

    return oddCount % 2  == 0? false : true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num, ctr = 0;
        boolean x = false;

        System.out.print("Enter a number: ");
        num = scan.nextInt();
        for(int i = 0 ; i < num; i++){
            if( checkLuck(i) == true && checkBits(i) == false){
                System.out.println( i + " is Unlucky Evil");
                x = true;
                ctr++;
            }

        }
        if(x == false) 
            System.out.println("There are no Unlucky Evil numbers from 1 to " + num);
        else
            System.out.println("There are " + ctr + " Unlucky Evil Numbers from 1 to " + num);
    }
}