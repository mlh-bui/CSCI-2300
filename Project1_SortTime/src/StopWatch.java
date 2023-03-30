// Project 1 Array Manipulation
// Stopwatch class using java.util.Date
// Gets start & stop time, and elapsed time
//
// CSCI 2300 M01 - Marissa Bui - 2/7

import java.util.Date;

public class StopWatch {
    /** Declare start & stop variables - long type */
    private long startTime;
    private long stopTime;

    /**
     * Default Constructor set to Zero
     */
    public StopWatch() {
        this.startTime = 0;
        this.stopTime = 0;
    } // constructor StopWatch

    /**
     * Sets start time
     */
    public void start() {
        // create date object to use getTime method
        Date d = new Date();
        this.startTime = d.getTime();
    } // method start

    /**
     * Sets end time
     */
    public void stop() {
        // create date object to use getTime method
        Date d = new Date();
        this.stopTime = d.getTime();
    } // method stop

    /**
     * Difference between start and stop time
     *
     * @return long, elapsed time
     */
    public long getElapsedTime() {
        return this.stopTime - this.startTime;
    } // method getElapsedTime

    /**
     * Simple toString for Stopwatch
     *
     * @return String, start & stop times
     */
    public String toString() {
        return String.format("StopWatch: \nStart Time = %d Stop Time = %d", this.startTime, this.stopTime);
    } // method toString

} // class StopWatch