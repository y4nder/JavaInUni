import java.util.Random;
public class RandomNames{
   public static void main(String[] args){
      int nameFirst, nameLast;
      String name = "";
      Random rand = new Random();
      
      nameFirst = rand.nextInt(14);
      nameLast = rand.nextInt(14);
      
      System.out.println("Random Name Generator: ");
            
      switch(nameFirst){
         case 0: name += "Anna"; break;
         case 1: name += "Ada"; break;
         case 2: name += "Kristen"; break; 
         case 3: name += "Britney"; break;
         case 4: name += "Ronald"; break;
         case 5: name += "Wenz"; break;
         case 6: name += "Mirai"; break;
         case 7: name += "Shem"; break;
         case 8: name += "Leander"; break;
         case 9: name += "Sofia"; break;
         case 10: name += "Jerold"; break;
         case 11: name += "Gleen"; break;
         case 12: name += "Aaron"; break;
         case 13: name += "Tristan"; break; 
         case 14: name += "Harvey"; break;    
      }
      
      switch(nameLast){
         case 0: name += " White"; break;
         case 1: name += " Campbell"; break;
         case 2: name += " Goodman"; break;
         case 3: name += " Duncan"; break;
         case 4: name += " Duca"; break;
         case 5: name += " Anderson"; break;
         case 6: name += " Tarculas"; break;
         case 7: name += " Perkins"; break;
         case 8: name += " Montelibano"; break;
         case 9: name += " Lubguban"; break;
         case 10: name += " Noynay"; break;
         case 11: name += " Sayson"; break; 
         case 12: name += " Lebayne"; break;
         case 13: name += " Pesco"; break;
         case 14: name += " Celino"; break;
      }
      System.out.println(name); 
   }
}