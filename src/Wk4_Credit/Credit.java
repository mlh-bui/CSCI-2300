package Wk4_Credit;

public class Credit {

    /**
     * Method to find if the entered Long integer is valid
     * Calls other conditional methods
     *
     * @param credit , long from user
     * @return boolean , true if valid credit number, false otherwise
     */
    public static boolean isValid(long credit) {
        // Checks each condition for a valid credit card number
        boolean checkSum = (sumOfOddPlace(credit) + sumOfDoubleEvenPlace(credit)) % 10 == 0;
        boolean checkPrefix = prefixMatched(credit, 4)
                || prefixMatched(credit, 5)
                || prefixMatched(credit, 6)
                || prefixMatched(credit, 37);
        boolean checkSize = (getSize(credit) >= 13 && getSize(credit) <= 16);

        // true if all conditions are true
        return (checkSize && checkPrefix && checkSum);
    }

    /**
     * Numbers greater than 10 get their digits added
     *
     * @param digit
     * @return int
     */
    public static int getDigit(int digit) {
        int valueOfDigit;
        if (digit < 9) {
            valueOfDigit = digit;
        } else {
            // adds first & second place in a number
            // ex: 12 --> 1 + 2 = 3
            valueOfDigit = digit / 10 + digit % 10;
        }
        return valueOfDigit;
    }

    /**
     * Finds and doubles sum of the even place's in a long
     *
     * @param num
     * @return sum
     */
    public static int sumOfDoubleEvenPlace(long num) {
        int sumOfEvenPlaces = 0;
        String digToString = Long.toString(num);
        // starting at the first even digit in the long
        // x -= 2 to skip every other digit
        for(int i = digToString.length() - 2; i >= 0; i -= 2){
            // convert each char to an int and doubles it, add to sum
            sumOfEvenPlaces += getDigit(Integer.parseInt(digToString.charAt(i) + "") * 2);
        }
        return sumOfEvenPlaces;
    }

    /**
     * Finds sum of the odds place's in a long
     *
     * @param num
     * @return sum
     */
    public static int sumOfOddPlace(long num) {
        int sumOfOddPlaces = 0;
        String digToString = Long.toString(num);
        // starts at first odd digit, skips to each odd in long
        for(int x = digToString.length() - 1; x >= 0; x -= 2){
            // // convert each char to an int adds to sum
            sumOfOddPlaces += Integer.parseInt(digToString.charAt(x) + "");
        }
        return sumOfOddPlaces;
    }

    /**
     * Long to string to get the length
     *
     * @param num
     * @return length of a long
     */
    public static int getSize(long num) {
        return Long.toString(num).length();
    }

    /**
     * Finds first digits of a long depending on K
     *
     * @param num
     * @param k
     * @return prefix as a long
     */
    public static long getPrefix(long num, int k) {
        long number = 0L;
        if (getSize(num) > k) {
            String numToString = Long.toString(num);
            numToString = numToString.substring(0,k);
            number = Long.parseLong(numToString);
        }
        return number;
    }

    /**
     * Checks if prefix match the long
     *
     * @param num
     * @param d
     * @return boolean, true if d is a prefix in the number, false otherwise
     */
    public static boolean prefixMatched(long num, int d) {
        return getPrefix(num, getSize(d)) == d;
    }
}
