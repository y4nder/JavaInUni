import java.io.*;
import java.util.Scanner;

public class ImageDisplay {
    public static void main(String[] args)throws FileNotFoundException{
        File file = new File("C:/Users/user/Documents/vscode/Java-Language-School/LubgubanL/Exercises/Chapter 67/output.txt");
        Scanner scan = new Scanner(file);
        int x = 0;

        while( scan.hasNextLine() ){
            for(int i = 0; i < 64; i++){
                switch( x / 8){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print(".");
                        break;
                    case 2:
                        System.out.print("'");
                        break;
                    case 3:
                        System.out.print("-");
                        break;
                    case 4:
                        System.out.print("+");
                        break;
                    case 5:
                        System.out.print("o");
                        break;
                    case 6:
                        System.out.print("O");
                        break;
                    default:
                        System.out.print("X");
                        break;
                }
            }
            scan.nextLine();
            System.out.println("");
            x++;
        }
    }
}
