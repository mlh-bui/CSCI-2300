package Wk6_MidtermPrep;

public class TestFraction {
    public static void main(String[] args) {

        // From tests in Homework Description
        Fraction a = new Fraction(1, 3);
        Fraction b = new Fraction(17);
        Fraction c = new Fraction(2).add( new Fraction(1,5) );
        Fraction answer = a.multiply(b.divide(c));
        System.out.println(answer); // calls answer.toString() which is "85/33"
        System.out.println("Answer in decimal: " + answer.doubleValue());

        System.out.println("\nChecks Standard Form: ");
        System.out.println("2/-6 --> " + new Fraction(2, -6));

        Fraction f = new Fraction(20, 42);  // 20/42 = 10/21
        System.out.println("20/42 --> " + f.toString());
        Fraction f2 = new Fraction(3);

        System.out.println("3/1 --> " + f2.toString()); // DON'T return "3/1"

        System.out.println("\nChecks Multiplication: ");
        Fraction g = f.multiply(f2);
        System.out.println("10/21 * 3: " + g.toString());

        System.out.println("\nChecks Power: ");
        Fraction f3 = new Fraction(2,3);
        System.out.println("2/3 to the power of 2: " + f3.pow(2).toString());

        System.out.println("\nChecks Subtraction: ");
        Fraction f4 = new Fraction(7,9);
        Fraction f5 = new Fraction(2,3);
        System.out.println("7/9 - 2/3 = " + f4.subtract(f5));

        System.out.println("\nChecks isEqual: ");
        Fraction f6 = new Fraction(1,2);
        Object obj = new Fraction(1,2);

        System.out.println("Object: " + obj);
        System.out.println("Fraction: " + f6);
        System.out.println("Is equal? " + f6.isEqual(obj));

        System.out.println("Object = Fraction after Negation? ");
        System.out.println("Fraction: " + f6.negate());
        System.out.println("Is equal? " + f6.equals(obj));
    }
}
