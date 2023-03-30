// Project 1 Array Manipulation
// Testing for Main
//
// CSCI 2300 M01 - Marissa Bui - 2/16

import java.util.Scanner; // need to include import statement

public class TestProgram {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); // declare and instantiate scanner object
        System.out.print("Please enter number of elements in array: "); // prompt user for nr of elements
        int nrElements = s.nextInt();
        System.out.println("Now creating the random array object...");
        RandomArray r = new RandomArray(nrElements); // declare and instantiate RandomArray object

        System.out.println("The return value of RandomArray's .isSorted() method now is: " + r.isSorted());

        System.out.println("Now sorting using bubble sort...");
        long bsTime = r.BubbleSort(); // run BubbleSort algorithm
        System.out.println("The return value of RandomArray's .isSorted() method now is: " + r.isSorted());
        System.out.println("Bubble sort algorithm took: " + bsTime + " milliseconds to complete");
        System.out.println("Randomizing array...");
        r.randomize();
        System.out.println("The return value of RandomArray's .isSorted() method now is: " + r.isSorted());

        System.out.println("Now sorting using Java Standard Libraries .ArraySort() method ...");
        long asTime = r.ArraySort(); // run Java's ArraySort algorithm
        System.out.println("The return value of RandomArray's .isSorted() method now is: " + r.isSorted());
        System.out.println("Arrays.sort algorithm took: " + asTime + " milliseconds to complete");
    }
}