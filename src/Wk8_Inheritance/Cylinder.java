// 3/9 In-Class exercises

package Wk8_Inheritance;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }

    public Cylinder(double r) {
        super(r);
        this.height = 1.0;
    }

    public Cylinder() {
        this.height = 1.0;  // put default in constructor rather than top
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}