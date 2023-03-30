// 3/7 In-Class exercises

package Wk8_Inheritance;

public class MyPointTest {

    public static void main(String[] args) {
        int x = 0;
        int y = 2;

        MyPoint p1 = new MyPoint(x, y);  // Test constructor
        System.out.println(p1);      // Test toString()
        p1.setX(8);   // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX());  // Test getters
        System.out.println("y is: " + p1.getY());
        System.out.println("Testing get XY");
        p1.setXY(3, 0);   // Test setXY()
        System.out.println(p1.getXY()[0]);  // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2));    // which version?
        System.out.println(p2.distance(p1));    // which version?
        System.out.println(p1.distance(5, 6));  // which version?
        System.out.println(p1.distance());      // which version?

        System.out.println("\nPOINT 3D");
        Point3D p3 = new Point3D(7, 2, 6);
        System.out.println(p3.toString());
        System.out.println(p3.getXYZ()[0]);
        System.out.println(p3.getXYZ()[1]);
        System.out.println(p3.getXYZ()[2]);
        System.out.println(new Point3D());

    }

}
