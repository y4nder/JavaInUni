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

      if(items == 1)
         time = time;
                   
      if(items == 2)
         time += time/2;
                  
      if(items == 3)
         time = time*2;
         
      if(items > 3){
         System.out.println("Heating more than three items at once is not recommended");
         time = 0;
      }
         
      minutes = time / 100;
      seconds = time % 100;
      
      System.out.println("Heat for " + minutes + " minutes " + seconds + " seconds");
   }
}