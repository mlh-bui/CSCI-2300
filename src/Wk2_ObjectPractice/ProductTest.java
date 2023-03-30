package Wk2_ObjectPractice;// Homework Assignment 2 Test - 1/24
// Testing Wk2_ObjectPractice.Product class
// COMP 313 - Marissa Bui

public class ProductTest {
    public static void main (String[] args) {
        // Creating objects for tests
        Product banana = new Product("Banana",30,1.2);
        Product apple = new Product("Apple",10,.50);

        System.out.printf("Before purchase: %d %ss", banana.getAmount(), banana.getName());
        banana.makePurchase(10);
        System.out.printf("\nAfter purchase: %d %ss", banana.getAmount(), banana.getName());
        System.out.printf("\nThe cost of %d %ss is: $%.2f", 3, banana.getName(), banana.calculatePrice(3));

        apple.makePurchase(10);
        System.out.printf("\nAfter purchase: %d %ss\n", apple.getAmount(), apple.getName());

        apple.makePurchase(1);
    } // method main

} // class Wk2_ObjectPractice.ProductTest
