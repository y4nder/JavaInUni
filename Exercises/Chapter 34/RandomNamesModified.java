import java.util.Random;
public class RandomNamesModified{
   public static void main(String[] args){
      int nameFirst, nameLast;
      String name = "";
      Random rand = new Random();
      
      nameFirst = rand.nextInt(14);
      nameLast = rand.nextInt(14);
      
      System.out.println("Random Name Generator: ");
            
      int exit = 0, count = 0;
      while(exit == 0){
         switch(nameFirst){
            case 0: name += "Anna"; break;
            case 1: name += "Ada"; break;
            case 2: name += "Arielle"; break; 
            case 3: name += "Kristen"; break;
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
         
         
         if(name.equals("Kristen Lubguban")){
            exit = 1;
            System.out.print(name.toUpperCase() + " Found after " + (count+1) + " tries!");
         }            
         else{ 
            name = "";
            nameFirst = rand.nextInt(14);
            nameLast = rand.nextInt(14);
            count ++;
         }
      }
   }
}