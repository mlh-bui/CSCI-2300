package Wk7_Midterm;

public class Box_MainTest {
    public static void main(String[] args) {
        Box b1 = new Box(1,2,3);
        System.out.println("Box 1 \n" + b1.toString());
        System.out.println("CalculateVolume Method: " + b1.calculateVolume());

        Box b2 = new Box(2,1,3);
        System.out.println("\nBox 2 \n" + b2.toString());
        System.out.println("IsEqual Method: " + b1.isEqual(b2));

        Box b3 = new Box();
        System.out.println("\nStandard constructor \n" + b3.toString());

        Box b4 = new Box(-1,-22,5); // throws exception

    } // method main

} // class Box_MainTest
