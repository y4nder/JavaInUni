public class MonkeysInATree{
   public static void main(String[] args){
      String countWord = " ";       //initialize the count in words variable
      int countMonkey;
      
      //loops 5 times until countMonkey turns 0
      for( countMonkey = 5; countMonkey > 0; countMonkey--){
         
         //assign the proper count in words in the verse.
         if(countMonkey == 5)
            countWord = "Five";
         else if(countMonkey == 4)
            countWord = "Four";
         else if(countMonkey == 3)
            countWord = "Three";                  
         else if(countMonkey == 2)
            countWord = "Two";
         else if(countMonkey == 1)
            countWord = "One";
         
         //display the verse
         System.out.println(countWord + " little monkeys swinging in a tree");
         System.out.println("Teasing Mr Crocodile \"you can't catch me\"");
         System.out.println("Along came the crocodile as quiet as can be");
         System.out.println("and SNAP!\n");
      }
      
      System.out.println("No little monkeys swinging in a tree");
      System.out.println("No little monkeys swinging in a tree");       
   }
}