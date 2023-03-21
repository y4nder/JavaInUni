import java.util.*;
public class MultiplicationQuiz{
   public static void main(String[] args){
      int x, y, answer, correct = 0, count = 0;
      Scanner scan = new Scanner(System.in);
      Random ran = new Random();                      //new Random object is created
      
      while(count < 10){                              //the program will loop 10 times
         x = ran.nextInt(10);                            //generates a random number from (0-10) to store in x
         y = ran.nextInt(10);                            //generates a random number from (0-10) to store in y
         
         System.out.print("What is " + x + " x " + y + " ?: ");   //the user is asked to solve x multipled by y
         answer = scan.nextInt();                                 //user input
         
         if( answer == (x * y) ){                     //A condition to check if the user's input is equal to the correct product of x and y
            System.out.println("Right!");                //lets the user know if the input is correct.
            correct++;                                   //if the user input is correct, 1 is added to the variable correct
         }
         else{
            System.out.println("Wrong. ");               //lets the user know if the input is incorrect.
            System.out.print(x + " * " + y + " is " + (x * y) + "\n");
         }
         count++;
      }
      
      System.out.println("You got " + correct + " out of 10 questions correct!"); //displays the number of correct inputs
   }
}