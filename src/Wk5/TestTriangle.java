package Wk5;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle(10,2,40);
        System.out.println(t.toString());
        System.out.println("Side 1: " + t.getSide1());
        System.out.println("Area: " + t.Area());
    }
}
