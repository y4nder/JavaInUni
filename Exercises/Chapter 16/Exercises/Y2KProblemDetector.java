//exercise 5
import java.util.Scanner;
public class Y2KProblemDetector{
   public static void main(String[] args){
      int yearBirth, yearCurrent, age;
      Scanner scan = new Scanner(System.in);      
      
      System.out.print("Year of Birth: ");
      yearBirth = scan.nextInt();
      
      System.out.print("Current year: ");
      yearCurrent = scan.nextInt();
      
      if(yearBirth < yearCurrent){
         age = yearCurrent - yearBirth;
      }
      else{
         age = (100 + yearCurrent) - yearBirth;
      }
      
      System.out.println("Your age: " + age);
   }
}