package Wk1_Intro;// 1/17 In-class exercises
// Simple BMI calculator
// COMP 313 - Marissa Bui
import java.util.Scanner;
public class Module1x4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for user
        System.out.println("This is a calculator to find your BMI weight");
        System.out.println("Note: All values are doubles. Add .0 to any integer number");
        System.out.print("Please enter in your weight in lbs: ");
        double userWeight = input.nextDouble();
        System.out.println("Please enter in your height in inches: ");
        double userHeight = input.nextDouble();

        double BMI = ((userWeight * 703) / (userHeight * userHeight));
        System.out.printf("From the values given, %.2f inches & %.2f pounds your BMI is %.2f\n", userHeight, userWeight, BMI);
        System.out.println("Below is a chart for BMI values");
        System.out.printf("Underweight: \tLess than %.2f\n", 18.5);
        System.out.printf("Normal: \t\tBetween %.2f & %.2f\n", 8.5, 24.9);
        System.out.printf("Overweight: \tBetween %.2f & %.2f\n", 25.0, 29.9);
        System.out.printf("Obese: \t\t\t%.2f or greater\n",30.0);
    }
}