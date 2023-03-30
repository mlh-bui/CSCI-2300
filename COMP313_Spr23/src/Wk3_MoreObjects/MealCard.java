package Wk3_MoreObjects;
// 1/31 In-class exercises
// Creating a meal card for a student which decreases with purchases
// COMP 313 - Marissa Bui

public class MealCard {

    private String studentName;
    private int balance;
    private int foodPoints;

    public MealCard() {
        this.studentName = "";
        this.balance = 100; // initial value for a meal card
    }

    public MealCard(String name, int bal) {
        this.studentName = name;
        this.balance = bal;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getBalance() {
        return balance;
    }

    public int getFoodPoints() {
        return foodPoints;
    }

    public void setFoodPoints(int points) {
        this.foodPoints = points;
    }

    // returns balance after purchase
    public int makeAPurchase(int points) {
        int currentBalance = this.balance;
        if (this.balance - points > -1) {
            currentBalance = this.balance - points;
        } else {
            System.out.println("Your purchase did not go through. Not enough points");
        }
        return currentBalance;
    } // makeAPurchase

    public static void main(String[] args) {
        MealCard marissa = new MealCard("Marissa", 60);
        System.out.printf("Before purchase balance: %d\n", marissa.getBalance());
        marissa.makeAPurchase(10);
        System.out.printf("After purchase balance: %d\n", marissa.getBalance());

        marissa.makeAPurchase(1000);

        MealCard sofia = new MealCard("Sofia", 10);
        System.out.printf("Before purchase: %d\n", sofia.getBalance());
        sofia.setFoodPoints(3);
        sofia.makeAPurchase(sofia.getFoodPoints());
        System.out.printf("After purchase: %d\n", sofia.getBalance());
    } // method main

} // class Wk3_MoreObjects.MealCard