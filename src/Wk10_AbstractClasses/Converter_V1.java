// 3/22 Homework 6
// Version 1: without abstract class, will produce the error of Part B
//
// COMP 313 - Marissa Bui

package Wk10_AbstractClasses;

// a normal parent class
public class Converter_V1 {
    protected double from;
    protected double to;

    // methods to inherit which are the same
    public void setFrom(double from)
    {
        this.from = from;
    }

    public double getConversionResult()
    {
        return this.to;
    }

    // Notice: no convert method
}