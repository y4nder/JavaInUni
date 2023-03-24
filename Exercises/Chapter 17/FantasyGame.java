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