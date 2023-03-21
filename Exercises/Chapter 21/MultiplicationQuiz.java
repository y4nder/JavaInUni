import java.util.*;
public class MultiplicationQuiz{
   public static void main(String[] args){
      int x, y, answer;
      Scanner scan = new Scanner(System.in);
      Random ran = new Random();
           
      int count = 0;
      int correct = 0;
      
      while(count < 10){
         x = ran.nextInt(10);
         y = ran.nextInt(10);
         
         System.out.print("What is " + x + " * " + y + " ?: ");
         answer = scan.nextInt();
         
         if(answer == (x * y)){
            System.out.println("Right!");
            correct++;
         }
         else{
            System.out.println("Wrong. ");
            System.out.print(x + " * " + y + " is " + (x * y) + "\n");
         }
         count++;
      }
      
      System.out.println("You got " + correct + " out of 10 questions correct!");
   }
}