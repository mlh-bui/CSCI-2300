// 3/9 In-Class exercises

package Wk8_Inheritance;

public class Circle {
    private double r;

    public Circle() {
        this.r = 1.0;
    }

    public Circle(double radius) {
        this.r = radius;
    }


    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r,2);
    }

    public String toString() {
        return String.format("Circle[radius = %.2f", getRadius());
    }
}
