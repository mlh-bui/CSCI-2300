// 3/14 Project 3: Morse Code
// TestProgram to get the file storing the Morse Code Table
// Tests encode and decode methods using english phrases
//
// CSCI 2300 - Marissa Bui

public class TestProgram {
    public static void main(String[] args) {
        String file = "MorseTable.txt"; // file name for Morse Table

        String testPhrase1 = "Cryptography is the practice of securing communication and data by converting " +
                "it into a form that can only be read by authorized individuals. I";
        String testPhrase2 = "Quantum computing is a type of computing that uses quantum-mechanical " +
                "phenomena, such as superposition and entanglement, to perform operations on data. " +
                "Unlike classical computing, which relies on bits with only two values (0 or 1), quantum " +
                "computing uses quantum bits or qubits that can exist simultaneously in multiple states.";
        String testPhrase3 = "Small Test!"; // ! not in MorseTable.txt

        /*
        Note: chose to represent letters not in the Morse table as null
        Reasoning: Easy to throw an exception, but preference is a null where you can see which
        character isn't in the table, so you can add, edit, etc. as a fix rather than showing an error.
        I also just like this way better, and we had options.
        */

        // MorseEncode objects with input as English to test encode
        MorseEncode m1 = new MorseEncode(file, testPhrase2);
        MorseEncode m2 = new MorseEncode(file, testPhrase1);
        MorseEncode m3 = new MorseEncode(file, testPhrase3);

        // Phrases as Morse
        String inMorse1 = m1.encode();
        String inMorse2 = m2.encode();
        String inMorse3 = m3.encode();

        // MorseEncode objects with input as Morse to test decode
        MorseEncode m1_2 = new MorseEncode(file, inMorse1);
        MorseEncode m2_2 = new MorseEncode(file, inMorse2);
        MorseEncode m3_2 = new MorseEncode(file, inMorse3);

        System.out.println("Phrase 1 to Morse:\n" + inMorse2);
        System.out.println("Phrase 1 back to English:\n" + m2_2.decode());

        System.out.println("\nPhrase 2 to Morse:\n" + inMorse1);
        System.out.println("Phrase 2 back to English:\n" + m1_2.decode());

        System.out.println("\nPhrase 3 to Morse:\n" + inMorse3);
        System.out.println("Phrase 3 back to English:\n" + m3_2.decode());

        // Works with adding new morse translations to the text file,
        // New characters must be formatted the same. I added a "-" dash to test

    } // method main

} // class TestProgram
