// 3/14 Project 3: Morse Code
// MorseCode class, reads file with a scanner to create
// Hashmaps to hold English and Morse code Strings
//
// COMP 313 - Marissa Bui

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class MorseCode {

    /** Hashmap, key is an english character, maps to morse representation */
    HashMap<String, String> english2Morse;

    /** Hashmap, key is a morse representation, maps to english character */
    HashMap<String, String> morse2Letter;

    /**
     * Constructor to read a file to initialize fields
     *
     * @param fileName, file to get input for hashmap values
     */
    public MorseCode(String fileName) {
        // creates temporary hashmaps to hold values
        HashMap<String, String> eng2Morse = new HashMap<>();
        HashMap<String,String> morse2Eng = new HashMap<>();

        // Scanner to traverse file
        Scanner sc = null;
        try {
            // Creates a scanner object to read the file
            sc = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            // throws an exception if file not found in path
            throw new RuntimeException(e);
        }

        while (sc.hasNext()) {
                // Temporary array to hold values from a line in the input file
                String[] record = sc.nextLine().split(" ");

                // Stores values into hashmap, ie English character and morse representations
                String eng = record[0];
                // toLowercase ensures morse representation is in the same format (T was "Dah")
                String morse = record[1].toLowerCase();
                eng2Morse.put(eng,morse);
                morse2Eng.put(morse,eng);
        }

        // Declares fields
        this.english2Morse = eng2Morse;
        this.morse2Letter = morse2Eng;

    } // constructor MorseCode

    /**
     * Method to get a value from english2Morse hashmap based on the key
     *
     * @param letter, english letter
     * @return String, morse representation of the letter
     */
    public String getMorse(String letter) {
        return english2Morse.get(letter);
    }

    /**
     * Method to get a value from morse2Letter hashmap based on the key
     *
     * @param morse, morse representation
     * @return String, letter associated to morse
     */
    public String getEnglish(String morse) {
        return morse2Letter.get(morse);
    }

    /**
     * String representation of english2Morse values
     * Aids testing and is the Standard toString for the class
     *
     * @return String, hashmap values
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String letter: english2Morse.keySet()) {
            String morse = english2Morse.get(letter);
            result.append(letter).append(" ").append(morse).append("\n");
        }
        return result.toString();
    } // method toString

} // class MorseCode