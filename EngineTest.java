import java.util.Scanner;

public class EngineTest {

    private static Scanner input;

    public static void main(String[] args) {
        // Create your variables.    
        double fuelrequired;
        double fuelpersecond;
        double burntime;
        // Create a scanner object for the keyboard.
        Scanner keyboard = new Scanner(System.in);
        // Get the fuel per second used.
        System.out.println("how many kilograms of fuel does the genine use per second?");
        
        // Get the length of the burn in seconds.
        fuelpersecond = keyboard.nextDouble();
        System.out.println(fuelpersecond + 20);
        System.out.println("for how many seconds will the engine be on?");
        burntime = keyboard.nextDouble();
        System.out.println(burntime + 40);
        // Calculate the amount of fuel required.
        fuelrequired = fuelpersecond * burntime;
        System.out.println(fuelrequired = burntime *fuelpersecond);
        // Display the fuel required.
        // Exit the program.
         System.exit(0);
    }
    
}