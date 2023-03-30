// 3/22 Homework 6
// Version 2: with the Abstract Converter
//
// COMP 313 - Marissa Bui

package Wk10_AbstractClasses;

public class MilesToKilometers extends Converter {
    // specific convert method for Miles to Km
    public void convert()
    {
        this.to = this.from * 1.609;
    }

}