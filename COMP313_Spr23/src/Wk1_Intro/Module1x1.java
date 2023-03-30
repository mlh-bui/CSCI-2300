package Wk1_Intro;
// 1/17 In-class exercises
// Model of purchasing items
// COMP 313 - Marissa Bui
import java.util.Scanner;
public class Module1x1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // Declaration of variables & prices
        String name;
        int thurgins;
        double nurvels = 0.55;
        double tombits = 0.45;
        double weenives = 1.23;

        System.out.print("What is your name? ");
        name = input.next();

        System.out.printf("Good morning, %s! We have a variety of thurgins to choose from today.\n", name);

        System.out.print("How many nurvels would you like? ");
        int numOfNurvels = input.nextInt();
        System.out.print("How many tombits would you like? ");
        int numOfTombits = input.nextInt();
        System.out.print("How many weenives would you like? ");
        int numOfweenives = input.nextInt();

        thurgins = numOfNurvels + numOfTombits + numOfweenives;
        double price = (numOfNurvels * nurvels) + (tombits * numOfTombits) + (numOfweenives * weenives);

        System.out.printf("\nThat will be %d thurgins total.\n", thurgins);
        System.out.printf("The total price is: %.2f$\n", price);
        System.out.printf("Thank you for your order, %s!", name);
    }
}