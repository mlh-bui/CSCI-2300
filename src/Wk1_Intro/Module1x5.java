package Wk1_Intro;// 1/17 In-class exercises
// Casting chars as ascii values
// COMP 313 - Marissa Bui
import java.util.Scanner;
public class Module1x5 {
    public static void main(String[] args) {
        // Getting input
        Scanner input = new Scanner(System.in);
        System.out.print("What is the char you want the ASCII value for? ");
        // input considered a string so get charAt position 0
        char ch = input.next().charAt(0);

        int asciiOfCh = (int) ch; // casting char as an int
        System.out.printf("The ascii value for '%s' is %d", ch, asciiOfCh); // prints results
    }
}