package Wk3_MoreObjects;
// Homework Assignment 3 - 1/31
// Plane booking application using an array
// COMP 313 - Marissa Bui

import java.util.Random;
import java.util.Scanner;

public class Module3x1_AirlineReservations {
    /**
     * Declaring seat limit variables for sections on the plane
     */
    private static final int FIRST_CLASS_SEAT_MAX = 5;
    private static final int TOTAL_SEAT_LIMIT = 20;

    /**
     * Finds random seat number for the class the user chooses
     *
     * @param classOption
     * @param plane
     * @return randomly assigned seat value
     */
    public static int seatNumber(int classOption, boolean[] plane) {
        int seat = 0;
        Random r = new Random();

        // First class seat selection
        if (classOption == 1) {
            seat = r.nextInt(FIRST_CLASS_SEAT_MAX);
            // check if seat is occupied
            while (plane[seat]) {
                // get another seat while the randomly selected seat is occupied
                seat = r.nextInt(FIRST_CLASS_SEAT_MAX);
            }
        }

        // Second class seat selection
        if (classOption == 2) {
            seat = r.nextInt(FIRST_CLASS_SEAT_MAX + 1, TOTAL_SEAT_LIMIT);
            while (plane[seat]) {
                seat = r.nextInt(FIRST_CLASS_SEAT_MAX + 1, TOTAL_SEAT_LIMIT);
            }
        }
        return seat;
    } // method seatNumber

    /**
     * Checks if seats in a particular class are all full
     *
     * @param min
     * @param max
     * @param plane
     * @return true or false, true if all seats are full, false if a seat is available
     */
    private static boolean isFull(int min, int max, boolean[] plane) {
        boolean isFull = false;
        for (int a = min; a < max; a++) {
            if (plane[a]) {
                // checks if seats at index are full
                isFull = true;
            }
            if (!plane[a]) {
                // if one seat is empty in the class, will return false
                isFull = false;
            }
        }
        return isFull;
    } // method isFull

    public static void main(String[] args) {
        boolean[] plane = new boolean[TOTAL_SEAT_LIMIT];

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 1 to book a 1st class seat or 2 for a Economy seat: ");
        int classOption = sc.nextInt();

        // Set Class Type
        String classType;
        if (classOption == 1) {
            classType = "First class";
        } else {
            classType = "Economy class";
        }

        // initialize default seat value (not assigned yet)
        int seat = 0;

        // check if array (the plane) is full
        if (isFull(0, TOTAL_SEAT_LIMIT, plane)) {
            System.out.println("Plane is completely full, all seats are taken."
                    + "\nContact an agent for help.");
            // check if first class is full
        } else if (isFull(0, FIRST_CLASS_SEAT_MAX, plane)) {
            System.out.println("First class is full");
            System.out.println("Do you want to change seats to Economy class? (y/n) ");
            String toChangeSeats = sc.next();
            // Option to change seats by the user
            if (toChangeSeats.equals("y")) {
                classOption = 2;                            // change class
                seat = seatNumber(classOption, plane);      // get new seat number
            } else {
                System.out.println("Please  wait  to  be  attended  by  one  of  our agents for help.");
            }
            // check if second class is full
        } else if (isFull(FIRST_CLASS_SEAT_MAX + 1, TOTAL_SEAT_LIMIT, plane)) {
            System.out.print("Do you want to upgrade to First class for a extra fee? (y/n) ");
            String toChangeSeats = sc.next();

            if (toChangeSeats.equals("y")) {
                classOption = 1;
                seat = seatNumber(classOption, plane);
            } else {
                System.out.println("Please  wait  to  be  attended  by  one  of  our agents for help.");
            }
            // No adjustments due to occupancy
        } else {
            seat = seatNumber(classOption, plane);      // get seat number in desired class
        }

        plane[seat] = true; // set seat as not empty

        // Print Plane Ticket Details
        System.out.println("\nPrint Boarding Pass:");
        System.out.printf("Seat Number: %d \nClass: %s", (seat + 1), classType);
    } // method main

} // class Wk3_MoreObjects.Module3x1_AirlineReservations
