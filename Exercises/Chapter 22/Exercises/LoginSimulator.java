/*
user name; password; priority
joy; sun; 4
gates; monopoly; 1
jobs; apple; 3
root; secret; 5
quit; exit, -1;
*/
import java.util.Scanner;
public class LoginSimulator{
   public static void main(String[] args){
      String username, password;
      int priority = 99;   //priority is initialized to 99.     
      Scanner scan = new Scanner(System.in);
      
      //input username
      System.out.print("User Name: ");
      username = scan.nextLine();
      
      //input password
      System.out.print("Password: ");
      password = scan.nextLine();
      
      //if username and password matches quit and exit, then priority will be -1 which is less than 0, the program will skip the loop.
      if (username.equals("quit") && password.equals("exit") ){
         priority = -1;
      }
      
      //since variable priority is initialized to 99, the while loop is true.
      while( priority > 0 ){
         //checks the username and password if there are matches, and then sets the value for variable priority.
         if( username.equals("joy") && password.equals("sun") ){
            priority = 4; 
         }
         else if ( username.equals("gates") &&  password.equals("monopoly") ){
            priority  = 1;
         }
         else if ( username.equals("jobs") && password.equals("apple") ){
            priority = 3;
         }
         else if ( username.equals("root") && password.equals("secret") ){
            priority = 5;
         }
         else{
            priority = 0;
            System.out.println("Logon failed");
         }
         
         //if username and password matches, priority access is displayed
         if (priority > 0){
            System.out.println("You have logged on with priority " + priority);
         }
         
         //ask for username and password again.
         System.out.print("User Name: ");       
         username = scan.nextLine();
         
         System.out.print("Password: ");
         password = scan.nextLine();
         
         //if username and password matches "quit" and "exit", priority will be less than 0, which stops the loop.
         if (username.equals("quit") && password.equals("exit") ){
            priority = -1;
         }
         else{
            //priority is reset to 99, 99 is greater than 0 so the loop will continue.
            priority = 99;
         }
      }
      System.out.println("System shutting down...");
      System.out.println("Bye.");  
   }
}