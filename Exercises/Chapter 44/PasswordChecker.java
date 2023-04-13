import  java.util.Scanner;
public class PasswordChecker{
   public static void main(String[] args){
      String password;
      boolean passLength = false, hasUpperLowerCase = false, hasDigit = false;
      Scanner scan =  new Scanner(System.in);
      
      while( passLength == false || hasUpperLowerCase == false || hasDigit == false ){
         System.out.println("Enter your password: ");
         password = scan.nextLine();
         
         if( password.length() >= 7 ){
            passLength = true;
            
            if( !password.equals( password.toUpperCase() ) && !password.equals( password.toLowerCase() ) ){
               hasUpperLowerCase = true;
               
               for( int i = 0; i < password.length(); i++ ){
                  if( Character.isDigit( password.charAt(i) ) ){
                     hasDigit = true;
                  }
               }
            }
         }

         if( passLength == false || hasUpperLowerCase == false || hasDigit == false ){
            System.out.println("That password is not acceptable.\n");
            passLength = false; hasUpperLowerCase = false; hasDigit = false;   
         }
      }
      System.out.println("Acceptable password.");
   }
}
