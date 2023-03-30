// 3/22 Homework 6
// Version 2: with the Abstract Converter
//
// COMP 313 - Marissa Bui

package Wk10_AbstractClasses;

public class PoundsToKilograms extends Converter {
    // specific convert method for lbs to Kg

    public void convert()
    {
        this.to = this.from/2.205;
    }

}