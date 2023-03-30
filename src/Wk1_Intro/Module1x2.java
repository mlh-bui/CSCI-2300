package Wk1_Intro;
// 1/17 In-class exercises
// Finding the remaining angle of a triangle given two angles
// COMP 313 - Marissa Bui
import java.util.Scanner;
public class Module1x2 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for the two known angles
        System.out.print("What is the first angle of the triangle? ");
        double angle1 = input.nextDouble();
        System.out.print("What is the second angle of the triangle? ");
        double angle2 = input.nextDouble();

        // Print results or show incorrect values
        if(angle1 + angle2 < 180) {
            // Calculate the third angle
            double angle3 = 180 - angle1 - angle2;
            System.out.printf("The value of the last angle of the triangle is: %.2f", angle3);
        } else {
            System.out.println("Restart the program, the input is incorrect (aka angles exceed 180)");
        }
    }
}