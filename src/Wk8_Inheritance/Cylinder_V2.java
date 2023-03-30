package Wk8_Inheritance;

public class Cylinder_V2 {
    private double height;
    private Circle c;

    private double r = c.getRadius();

    public Cylinder_V2(Circle circle, double h) {
        this.height = h;
        this.c = circle;
    }

    public Cylinder_V2(double r, Circle circle) {
        this.height = 1.0;
        this.c = circle;
    }

    public Cylinder_V2() {
        this.height = 1.0;  // put default in constructor rather than top
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(Circle circle) {
        return circle.getArea() * height;
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

}