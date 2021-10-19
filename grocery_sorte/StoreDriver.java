package grocery_sorte;
import java.util.Scanner;

public class StoreDriver {
    // Driver method
    public static void main(String args[]) {
        Store gStore = new Store();
        System.out.println("Welcome to the Grocery SortE App!");

        System.out.println("\nWhat would you like to do?");
        System.out.println("Enter 'start' to start a new trip. ");
        System.out.println("Enter 'quit' to end this session\n");

        Scanner in = new Scanner(System.in);
        boolean run = true;
        while(run) {
            String s= in.nextLine();
            if(s.equals("quit")) {
                run = false;
                //save data in extenal file
                System.out.println("Thank you for using the Grocery SortE App!\nNave a nice day!");
            }//end of if statement
    
            if(s.equals("start")) {
                gStore.path();
            }

        }//end of while loop
        in.close();
        
    }//end of main method
}//end of StoreDriver class
