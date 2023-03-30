// Project 1 Array Manipulation
// Random Array Class, methods to sort and initialize array
//
// CSCI 2300 M01 - Marissa Bui - 2/7

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    /** Declaring array variable */
    private int[] arr;

    /**
     * General constructor for Random Array
     * Creates new array
     * Calls randomize() to fill array
     *
     * @param size, array size
     */

    public RandomArray(int size) {
        this.arr = new int[size];
        randomize();
    } // constructor RandomArray

    /**
     * Method to assign elements in array random values
     */
    public void randomize() {
        Random r = new Random();
        for(int i = 0; i < this.arr.length; i++) {
            this.arr[i] = r.nextInt(0,1024);
        }
    } // method randomize

    /**
     * Uses Bubble Sort Algorithm to sort an array
     * Times the process using class StopWatch
     *
     * @return long, elapsed time of Bubble sort
     */
    public long BubbleSort() {
        // create new StopWatch object
        StopWatch sw = new StopWatch();
        sw.start(); // start timing

        for (int i = 0; i < this.arr.length - 1; i++) {
            for (int j = 0; j < this.arr.length - i - 1; j++) {
                // Compare 1st element to 2nd element
                // "Swap" elements if 1st is greater
                if (this.arr[j] > this.arr[j + 1]) {
                    int tempArray = this.arr[j];    // 1st element goes in temp array
                    this.arr[j] = this.arr[j + 1];  // 2nd element is moved to position 1
                    this.arr[j + 1] = tempArray;    // Place element in temp array back
                }
            }
        }
        sw.stop();  // end timing

        return sw.getElapsedTime();
    } // method BubbleSort

    /**
     * Times the process of using Arrays.sort() method
     *
     * @return long, elapsed time of Arrays.sort()
     */
    public long ArraySort() {
        // create new StopWatch object
        StopWatch sw = new StopWatch();
        sw.start();
        Arrays.sort(this.arr);
        sw.stop();
        return sw.getElapsedTime();
    } // method ArraySort

    /**
     * Determines if the array is sorted by comparing
     * element's values to their neighbor
     *
     * @return bool, True if sorted, False otherwise
     */
    public boolean isSorted() {
        boolean sorted = true;
        int i = 0;
        while (i < this.arr.length - 1 && sorted) {
            // if the 2nd element is greater, it is sorted
            // loop ends any case the element is not sorted
            sorted = this.arr[i] <= this.arr[i + 1];
            i++;    // update iterator
        }

        return sorted;
    } // method isSorted

    /**
     * Simple toString for Array contents
     *
     * @return String, elements in Array
     */
    public String toString() {
        // Create string to return
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int j = 0; j < this.arr.length; j++) {
            // append elements to array, if last element forgo comma
            sb.append(j < this.arr.length - 1 ? (this.arr[j] + ", ") : this.arr[j]);
        }
        return sb.append("]").toString();   // return string with brackets
    } // method toString

} // class RandomArray