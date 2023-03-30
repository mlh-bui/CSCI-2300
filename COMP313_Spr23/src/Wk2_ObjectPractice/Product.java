package Wk2_ObjectPractice;
// Homework Assignment 2 - 1/24
// Creating an object Wk2_ObjectPractice.Product & its attributes
// Methods to track pricing & purchase
// COMP 313 - Marissa Bui

public class Product {
    /**
     * Declaration of Instance variables
     * Wk2_ObjectPractice.Product name, amount, & price
     */
    private String name;    // product name
    private int amount;     // product in stock
    private double price;   // product regular price

    /**
     * Main Constructor for a Wk2_ObjectPractice.Product
     *
     * @param name
     * @param amount
     * @param price
     */
    public Product(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    /**
     * Getter & Setter methods
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Receives the number of Items to purchase & calculates
     * price based off possible discounts
     *
     * @param numOfItems
     * @return total price of Items
     */
    public double calculatePrice(int numOfItems) {
        // set the return value
        double price;

        // calculate discount based on num of Items
        if(numOfItems < 10) {
            price = numOfItems * this.price;
        } else if (10 < numOfItems && numOfItems < 99) {
            price = (numOfItems * this.price) * 0.10;
        } else {
            price = (numOfItems * this.price) * 0.20;
        }
        return price;
    } // method calculatePrice

    /** Method to adjust total amount of a product because of items purchased
     *
     * @param numOfItems
     */
    public void makePurchase (int numOfItems) {
        if(this.amount - numOfItems >= 0) {
            this.amount = this.amount - numOfItems;
        } else {
            // conditional output if the input exceeds the amount
            System.out.println("Cannot make purchase, there is not enough of the product in stock");
        }
    } // method makePurchase

} // class Wk2_ObjectPractice.Product