public class SheepHerdSize{
   public static void main(String[] args){
      double sheepNumber = 20; //the sheep population starts at 20
      double power = 1; //a variable power is created to solve for (0.83)^t and is initialized to 1; 
      int years;
      
      for(years = 1; sheepNumber < 80; years++){ //the loop iterates until the sheep population reaches over 80
         power *= 0.83;
         sheepNumber = 220 / (1 + 10 * power);
      }
      System.out.println("The 20 bighorn sheeps are expected to reach population size over 80 in " + years + " years");
   }
}