package Wk3_MoreObjects;
// 1/31 In-class exercises
// Calculating a cylinder
// COMP 313 - Marissa Bui

public class Cylinder {
    // Declaring Variables
    // Note: more practical to make variables floats (didn't but can do later)
    private int radius;
    private int height;

    // Default values
    public Cylinder() {
        this.radius = 1;
        this.height = 1;
    }

    public Cylinder(int r, int h) {
        this.radius = r;
        this.height = h;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        if(r >= 0){
            this.radius = r;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        if(h >= 0) {
            this.height = h;
        }
    }

    public double calculateSurfaceArea (int r, int h) {
        return (2 * Math.PI * Math.pow(r, 2)) + (2 * Math.PI * r * h);
    } // method calculateSurfaceArea

    public double calculateVolume (int r, int h) {
        return (Math.PI * Math.pow(r, 2) * h);

    } // method calculateVolume

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        double vol = c.calculateVolume(1,2);
        System.out.printf("The volume of a circle with radius = %d and height = %d is %f",
                c.getRadius(), c.getHeight() ,vol);

        double sArea = c.calculateSurfaceArea(2,17);
        System.out.printf("\nThe surface area of a circle with radius = %d and height %d is %f",
                c.getRadius(), c.getHeight(), sArea);

    } // method main

} // class Wk3_MoreObjects.Cylinder

