package Wk4_Credit;

import java.util.Scanner;
import static Wk4_Credit.Credit.isValid;

public class TestCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number (only digit): ");

        long number = input.nextLong();

        if (isValid(number))
            System.out.println(number + " is valid");
        else
            System.out.println(number + " is invalid");
    }
}
