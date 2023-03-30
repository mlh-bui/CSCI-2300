// 3/22 Homework 6
// Version 2: with the Abstract Converter
//
// COMP 313 - Marissa Bui

package Wk10_AbstractClasses;

import java.util.Scanner;

public class Driver
{
    public static void getInput(Converter converter) {
        System.out.print("Enter amount: ");
        Scanner scanner = new Scanner(System.in);
        converter.setFrom(Double.valueOf(scanner.nextLine()));
    }

    public static void convertAndPrintResults(Converter converter)
    {
        converter.convert();
        System.out.println("Conversion result is " + converter.getConversionResult());
    }

    public static void main(String []args)
    {
        Converter weightConverter = new PoundsToKilograms();
        System.out.println("Test for part B: ");
        convertAndPrintResults(weightConverter); // default value printed

        //TESTING FOR PART 1: It works
        System.out.print("Test for F to C ");
        Converter tempConverter = new FahrenheitToCelsius();

        getInput(tempConverter); // since tempConverter = Convertor it works as a parameter
        tempConverter.convert();
        System.out.println(tempConverter.getConversionResult() + " Celsius");

        System.out.print("Test for mi to km: ");
        Converter milesConverter = new MilesToKilometers();

        getInput(milesConverter);
        milesConverter.convert();
        System.out.println(milesConverter.getConversionResult() + " Kilometers");


    }
}