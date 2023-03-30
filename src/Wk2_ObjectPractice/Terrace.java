package Wk2_ObjectPractice;
// 1/26 In-class exercises
// Module 2x1
// Entering & Leaving a Wk2_ObjectPractice.Terrace based on capacity
// COMP 313 - Marissa Bui

public class Terrace {
    private int capacity;
    private int currentPeople;
    private int groupsDenied;
    private int totalPeopleDenied;

    public Terrace(int capacity) {
        this.capacity = capacity;
    }

    public boolean processEnter(int people) {
        boolean peopleEnter = true;
       int checkPeople = this.currentPeople + people;
        if(checkPeople > this.capacity) {
            peopleEnter = false;
            this.groupsDenied++;
            totalPeopleDenied += people;
        } else {
            this.currentPeople += people;
        }
        return peopleEnter;
    }

    public void processLeave(int people) {
       this.currentPeople -= people; // how many people on the terrace
    }

    public int getNumGroupsDenied() {
        return this.groupsDenied;
    }

    public int getTotalPeopleDenied() {
        return this.totalPeopleDenied;
    }

    public static void main(String[] args) {
        Terrace terrace = new Terrace(4);
        terrace.processEnter(3);
        terrace.processEnter(2);
        terrace.processLeave(1);
        terrace.processEnter(1);
        terrace.processLeave(2);
        System.out.printf("Total groups denied: %d\n", terrace.getNumGroupsDenied());
        System.out.printf("Total people denied: %d", terrace.getTotalPeopleDenied());
    }
}
