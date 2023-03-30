package Wk4_Credit;

public class FractionSimple {

    private int numerator;
    private int denominator;

    public FractionSimple(int num, int denum) {
        setDenominator(denum);
        setNumerator(num);
    }

    public FractionSimple() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public FractionSimple(FractionSimple F) {
        this.numerator = F.getNumerator();
        this.denominator = F.getDenominator();
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denum) {
        if (denum == 0) {
            //Fatal error
            // usually write an exception instead of a print statement
            System.err.println("Fatal Error");
            System.exit(1);
        }
        denominator = denum;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public double findFraction() {
        return (double) getNumerator() / getDenominator();
    }

    public static int greatestCommonDivider (int a, int b) {
        int gcd = 0;
        if(a < 0 && a * a == -a) {
            while(b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
                a = gcd;
            }
            if(a == 0) {
                gcd = 0;
            }
        }
        return gcd;
    }

    /**
     * Creates a new fraction which is the simplified version
     * of the original fraction
     * Mutable Method <<
     * Don't need to keep the original one so unnecessary <--
     *
     * @return fraction, simplified using gcd
     */
    public FractionSimple simplify() {
        int gcd = greatestCommonDivider(this.numerator, this.denominator);
        int denum = getDenominator();
        int num = getNumerator();
        return new FractionSimple(num/gcd,denum/gcd);
    }

    /**
     * This one preferred
     * Updating fraction, not creating new object
     * Better for out purposes
     * Void function so just changes the value for fraction
     */
    public void simplify1() {
        int denum = getDenominator();
        int num = getNumerator();
        int gcd = greatestCommonDivider(num, denum);
        setNumerator(num/gcd);
        setDenominator(denum/gcd);
    }

    public String toString( ) {
        return getNumerator() + "/" + getDenominator();
    }

    public FractionSimple add(FractionSimple fr) {
        int newNum = (fr.numerator*this.denominator + this.numerator * fr.denominator);
        int newDenum = fr.denominator * this.denominator;

        FractionSimple F1 = new FractionSimple(newNum, newDenum);
        return F1.simplify();
    }

    public static void main(String[] args) {
        FractionSimple test = new FractionSimple();
        test.setNumerator(19);
        test.setDenominator(10);
        System.out.printf("%s = %.2f", test.toString(), test.findFraction());

        FractionSimple test2 = new FractionSimple(20,10);
        System.out.printf("\n%s = %.2f", test2.toString(), test.findFraction());

        FractionSimple test3 = new FractionSimple(test);
        System.out.println("\nTest with Fractional Param: " + test3.toString());

        test2.simplify1();
        System.out.println(test2.toString());
    }

} // class FractionSimple