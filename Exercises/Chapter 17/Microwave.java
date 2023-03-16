import java.util.Scanner;
public class Microwave{
   public static void main(String[] args){
      int time, items;
      int minutes, seconds;
      String itemName;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How many items to heat: ");
      items = scan.nextInt();
            
      System.out.print("Time for one item: ");
      time = scan.nextInt();
      
      seconds = (time / 100) * 60;
      seconds += time % 100;

      if(items == 1)
         seconds = seconds;
                   
      if(items == 2)
         seconds += seconds/2;
                  
      if(items == 3)
         seconds = seconds*2;
         
      if(items > 3){
         System.out.println("Heating more than three items at once is not recommended!");
         seconds = 0;
      }

      minutes = seconds / 60;
      seconds = seconds % 60;    
      
      System.out.println("Heat for " + minutes + " minutes " + seconds + " seconds");
   }
}