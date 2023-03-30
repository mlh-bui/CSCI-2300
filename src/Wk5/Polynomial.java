package Wk5;

public class Polynomial {
    private float a;
    private float b;
    private float c;

    public Polynomial(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString() {
        return String.format("%.1fx^2+%.1fx+%.1f",this.a,this.b,this.c);
    }

    public boolean isEqual(Polynomial p) {
        return p.toString().equals(toString());
    }

    public void solve() {
        double x = (-b + Math.pow((Math.pow(b,2) - 4*a*c),0.5)) / (2*a);
        double x2 = (-b - Math.pow((Math.pow(b,2) - 4*a*c),0.5)) / (2*a);

        System.out.printf("Root 1: %.2f Root 2: %.2f", x, x2);
    }

    public Polynomial add(Polynomial p) {
        float newA = a + p.a;
        float newB = b + p.b;
        float newC = c + p.c;
        return new Polynomial(newA, newB, newC);
    }

    public static void main(String[] args) {
        Polynomial p = new Polynomial(2,4,-5);
        System.out.println("p: " + p.toString());

        Polynomial p2 = new Polynomial(2,4,-5);
        System.out.println("p2: " + p2.toString());

        Polynomial p3 = new Polynomial(1,8,4);
        System.out.println("p3: " + p3.toString());

        System.out.println("\np is equal to p2: " + p.isEqual(p2));
        System.out.println("p is equal to p3: " + p.isEqual(p3));

        System.out.println("add p & p2: " + p.add(p2));
        System.out.print("\nSolve function p3: " );
        p3.solve();

        System.out.print("\nSolve function p2: ");
        p2.solve();

    }
}