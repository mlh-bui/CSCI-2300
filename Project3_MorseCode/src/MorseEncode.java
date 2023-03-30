// 3/14 Project 3: Morse Code
// MorseEncode class to take input to encode or decode
// From Morse code representation to Eng, and vice versa
//
// COMP 313 - Marissa Bui
public class MorseEncode {
    /** Text input to manipulate */
    private final String text;

    /** MorseCode object to get morse and english */
    private final MorseCode mc;

    /**
     * Constructor to get filename and text
     *
     * @param filename, file to get input for hashmap values
     * @param text, String to store in field
     */
    public MorseEncode(String filename, String text) {
        mc = new MorseCode(filename);
        this.text = text;
    } // constructor MorseEncode

    /**
     * Processes English String and builds morse code, character by character
     *
     * @return String, morse representation
     */
    public String encode() {
        // text to uppercase since MorseTable accounts for A-Z
        String text = this.text.toUpperCase();
        // separates text into words in an array
        String[] words = text.split(" ");

        // initializes return string
        StringBuilder result = new StringBuilder();
        for (String s : words) {
            // separates each word into an array of its characters
            String[] letters = s.split("");

            // new StringBuilder to hold each letter's translation
            StringBuilder word = new StringBuilder();
            for (String l : letters) {
                // getMorse for letter and add to word
                word.append(mc.getMorse(l)).append(" ");
            }
            // add word to result string, separated by 3 spaces
            result.append(word).append("   ");
        }

        // return full translation of line
        return result.toString();
    } // method encode

    /**
     * Processes Morse code and builds English string, character by character
     *
     * @return String, English language equivalent
     */
    public String decode() {
        String text = this.text.toLowerCase();
        // separates text into words in an array
        String[] words = text.split(" {4}");

        // initializes return string
        StringBuilder result = new StringBuilder();
        for (String s : words) {
            // separates each word into an array of its morse code
            String[] morseCode = s.split(" ");

            // new StringBuilder to hold each letter's translation
            StringBuilder word = new StringBuilder();
            for (String l : morseCode) {
                // getEnglish for morse code and add to word
                word.append(mc.getEnglish(l));
            }
            // add word to result string, separated by 1 space
            result.append(word).append(" ");
        }

        // Preference, could've kept String in upper case, but readability was worse
        return result.toString().toLowerCase();
    } // method decode

} // class MorseEncode
