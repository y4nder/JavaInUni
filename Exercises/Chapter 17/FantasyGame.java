import java.util.Scanner;
public class FantasyGame{
   public static void main(String[] args){
      int strength, health, luck, totalPoints;
      String name;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Welcome to Yertle's Quest");
      
      System.out.print("Enter the name of your character: ");
      name = scan.nextLine();
      
      System.out.print("Enter strength (1-10): ");
      strength = scan.nextInt();
      
      System.out.print("Enter health (1-10): ");
      health = scan.nextInt();
      
      System.out.print("Enter luck (1-10): ");
      luck = scan.nextInt();
      
      totalPoints = strength + health + luck;
      
      if(strength > 10)
         strength = 10;
      if(strength < 0)
         strength = 0;
      
      if(health > 10)
         health = 10;
      if(health < 0)
         health = 0;
      
      if(luck > 10)
         luck = 10;   
      if(health < 0)
         luck = 0;            //line 24 to line 37, these series of single branch if statements prevents the user from entering outside the range
                              //if the input is over 10 it will default to 10, if the input is under 0 then it will default to 0, single branch was used to follow the theme of the chapter. 
      if(totalPoints > 15){
         strength= 5;
         health = 5;
         luck = 5;
         
         System.out.println("\nYou have given your character too may points!");
         System.out.println("Default values have been assigned.");
      }
      
      System.out.println("\n" + name + ", " + "strength: " + strength + ", health: " + health + ", luck: " + luck);
   }
}