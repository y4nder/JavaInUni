import  java.util.Scanner;
public class PasswordChecker{
   public static void main(String[] args){
      String password;
      Scanner scan =  new Scanner(System.in);
      
      System.out.println("Enter your password: ");
      password = scan.nextLine();
      
      for(int i = 0; i < password.length(); i++){
         char letter = password.charAt(i);
         if(letter.equals(password.toUpperCase.chaAt(i) ) )
      }
   }
}