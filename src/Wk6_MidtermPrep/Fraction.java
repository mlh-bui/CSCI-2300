package Wk6_MidtermPrep;

public class Fraction {
    /** Numerator for fraction */
    private long num;

    /** Denominator for fraction */
    private long denom;

    /**
     * Basic constructor for a Fraction
     *
     * @param n, set to Numerator
     * @param d, set to Denominator
     */
    public Fraction(long n, long d) {
        setDenom(d);
        setNum(n);
    }

    /**
     * Fraction with integer value
     *
     * @param n, the numerator
     */
    public Fraction(long n) {
        this.num = n;
        this.denom = 1;
    }

    /**
     * Fraction constructor as a Copy
     *
     * @param f, copy of fraction
     */
    public Fraction(Fraction f) {
        this.num = f.getNum();
        this.denom = f.getDenom();
    }

    /**
     * Fraction from a String value
     *
     * @param value, String input
     */
    public Fraction(String value) {
        int slashIndex = value.indexOf("/");
        // if / is not in string (so a whole number)
        if (slashIndex == -1) {
            this.num = Long.parseLong(value);
            this.denom = 1;
        } else {
            // substring of digits before / is the numerator
            this.num = Long.parseLong( value.substring(0, slashIndex));
            // substring of digits after / is the numerator
            this.denom = Long.parseLong(value.substring(slashIndex + 1));
        }
    }

    /* Accessors & Mutators */
    public long getDenom() {
        return this.denom;
    }

    public long getNum() {
        return this.num;
    }

    // private method to make the fraction immutable
    private void setDenom(long denom) {
        if (denom == 0) {
            //Fatal error
            // usually write an exception instead of a print statement
            System.err.println("Fatal Error");
            System.exit(1);
        }
        this.denom = denom;
    }

    // private methods to make the fraction immutable
    private void setNum(long num) {
        this.num = num;
    }

    /**
     * Uses Euclid's GCD Algorithm
     *
     * @param m, long
     * @param n, long
     * @return long greatest common divisor
     */
    public static long gcd(long m, long n) {
        while (n != 0) {
            long temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    } // method gcd


    /**
     * Updating fraction to Standard form
     * Uses gcd to simplify fraction
     * Changes place of sign if on the denominator
     */
    public void simplify() {
        long denom = getDenom();
        long num = getNum();

        // checks so gcd is positive
        long gcd = Math.abs(gcd(num, denom));

        // if denominator is negative, change signs
        // Simplify to standard form
        if (denom < 1) {
            denom = -denom;
            num = -num;
        }

        // sets new Numerator & Denominators
        setNum(num/gcd);
        setDenom(denom/gcd);
    } // method simplify

    /**
     * Method to add two Fractions
     *
     * @param f, Fraction object to add
     * @return new Fraction, sum of values
     */
    public Fraction add(Fraction f) {
        long newNum = (f.num *this.denom + this.num * f.denom);
        long newDenom = f.denom * this.denom;

        // Created new Fraction for the sum
        Fraction F1 = new Fraction(newNum, newDenom);
        F1.simplify();

        return F1;
    } // method add

    /**
     * Method to subtract two Fractions
     *
     * @param f, Fraction object to subtract
     * @return new Fraction
     */
    public Fraction subtract(Fraction f) {

        long newNum = (this.num * f.denom) - (f.num * this.denom);
        long newDenom = f.denom * this.denom;


        // Created new Fraction for the sum
        Fraction F1 = new Fraction(newNum, newDenom);
        F1.simplify();

        return F1;
    } // method subtract

    /**
     * Method to multiply two Fractions
     *
     * @param f, Fraction object to add
     * @return new Fraction, product of values
     */
    public Fraction multiply(Fraction f) {
        long newNum = (f.num * this.num);
        long newDenom = f.denom * this.denom;

        Fraction F1 = new Fraction(newNum, newDenom);
        F1.simplify();
        return F1;
    } // method multiply

    /**
     * Method to divide two Fractions
     *
     * @param f, Fraction object to add
     * @return new Fraction
     */
    public Fraction divide(Fraction f) {
        long newNum = (f.denom * this.num);
        long newDenom = f.num * this.denom;

        Fraction F1 = new Fraction(newNum, newDenom);
        F1.simplify();
        return F1;
    } // method divide

    /**
     * Method to negate the Fraction
     *
     * @return new Fraction, negative of the Fraction
     */
    public Fraction negate() {
        return new Fraction(-this.num,this.denom);
    }

    /**
     * Method to raise a Fraction to the n power
     *
     * @param n, int power
     * @return new Fraction, result of power
     */
    public Fraction pow(int n) {
        double num = getNum();
        double newNum =  Math.pow(this.num,n);
        double newDenom = Math.pow(this.denom,n);
        return new Fraction((long) newNum, (long) newDenom);
    } // method pow

    /**
     * Fraction as double
     *
     * @return decimal representing fraction
     */
    public double doubleValue() {
        return (double) getNum() / getDenom();
    }

    /**
     *
     * @param obj, unknown object comparing to Fraction
     * @return true, if obj matches fraction's values and type, false otherwise
     */
    public boolean isEqual(Object obj) {
        Fraction fr = new Fraction(this.num,this.denom);
        return fr.toString().equals(obj.toString());
    }

    /**
     * Standard toString
     * Returns only the numerator if denominator = 1
     *
     * @return String representation of fraction
     */
    public String toString( ) {
        simplify(); // uses simplify to get standard form
        return this.denom == 1 ? this.num + "" : this.num + "/" + this.denom;
    }

} // class Fraction