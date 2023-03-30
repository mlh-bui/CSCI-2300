package Wk1_Intro;// 1/17 In-class exercises
// Calculating energies given values from input
// COMP 313 - Marissa Bui
import java.util.Scanner;
public class Module1x3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        double g; // gravity
        double m; // mass
        double v; // velocity
        double y; //position

        // Declaration of result variables
        double kineticEnergy;
        double potentialEnergy;
        double totalEnergy;

        // Getting input
        System.out.println("Note: All values will be calculated as doubles and all input will be ints");
        System.out.println("Calculate the total energy based off gravity, mass, position, & velocity");
        System.out.print("Input gravity (g): ");
        g = input.nextDouble();
        System.out.print("Input mass (m): ");
        m = input.nextDouble();
        System.out.print("Input velocity (v): ");
        v = input.nextDouble();
        System.out.print("Input position (y): ");
        y = input.nextDouble();

        // Finding Resulting Energies
        kineticEnergy = (0.5*m*(Math.pow(v,(2/y))));
        potentialEnergy = (m*g*y);
        totalEnergy = kineticEnergy + potentialEnergy;

        System.out.println("\nFinding Kinetic Energy");
        System.out.println("Kinetic Energy = 1/2 * m * v ^ (2/y)");
        System.out.printf("1/2 * %.2f * %.2f ^ (2/%.2f) = %.2f\n", m, v, y, kineticEnergy);

        System.out.println("\nFinding Potential Energy");
        System.out.println("Potential Energy = m * g * y");
        System.out.printf("%.2f * %.2f * %.2f = %.2f\n", m, g, y, potentialEnergy);

        System.out.println("\nFinding Total Energy");
        System.out.println("Total Energy = Kinetic Energy + Potential Energy");
        System.out.printf("%.2f + %.2f = %.2f", kineticEnergy, potentialEnergy, totalEnergy);
    }
}