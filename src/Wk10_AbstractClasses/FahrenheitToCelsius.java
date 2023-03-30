// 3/22 Homework 6
// Version 2: with the Abstract Converter
//
// COMP 313 - Marissa Bui

package Wk10_AbstractClasses;

public class FahrenheitToCelsius extends Converter {

    // specific convert method for F to C
    public void convert()
    {
        this.to = (this.from - 32) * 5d/9d;
    }

}
