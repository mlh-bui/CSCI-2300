// 3/22 Homework 6
// Version 2: Abstract converter class
//
// COMP 313 - Marissa Bui

package Wk10_AbstractClasses;

public abstract class Converter {
    protected double from;
    protected double to;

    public void setFrom(double from)
    {
        this.from = from;
    }

    public double getConversionResult()
    {
        return this.to;
    }

    // Because of this abstract method, there will not be errors from Part B
    public abstract void convert();
}