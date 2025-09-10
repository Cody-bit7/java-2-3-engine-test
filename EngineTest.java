import java.util.Scanner;

public class EngineTest {

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
        System.out.println("for how many seconds will the engine be on?");
        burntime = keyboard.nextDouble();
        // Calculate the amount of fuel required.
        fuelrequired = fuelpersecond * burntime;
        // Display the fuel required.
         System.out.println("how much fuel is required?");
        fuelrequired = keyboard.nextDouble();
        // Exit the program.

    }
    
}