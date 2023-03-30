package Wk8_Inheritance;

import java.util.Arrays;

public class SortedSet extends SetAsArray {

    public SortedSet() {
        // Sorted set = items array from parent called through Arrays.sort
        Arrays.sort(this.items);
    }

    public void addItem(String item) {
        super.addItem(item);
        // everytime you add an item it goes to end of list, then sort
        Arrays.sort(items);
    }

    // Need to change return and parameter type to SortedSet
    public SortedSet setIntersect(SortedSet B) {
        // create set to hold intersecting values
        SortedSet intersect = new SortedSet();
        for(int i = 0; i < size(); i++) {
            // if set B has items in set A
            if(B.hasItem(items[i])) {
                intersect.addItem(items[i]); // add to intersect set
            }
        }
        return intersect;
    }

    public static void main(String[] args) {
        SortedSet mySet = new SortedSet();
        mySet.addItem("BB");
        mySet.addItem("A");
        mySet.addItem("CCCA");
        mySet.addItem("D");

        mySet.showContents();

        SortedSet mySet2 = new SortedSet();
        mySet2.addItem("AB");
        mySet2.addItem("CA");
        mySet2.addItem("BCCA");
        mySet2.addItem("BB");
        mySet2.addItem("A");
        mySet2.addItem("DH");
        mySet2.addItem("D");
        mySet2.showContents();

        System.out.println("\nTesting after remove");
        mySet2.removeItem("BCCA");
        // Don't need to change remove since the array will remain sorted after removal of a single item
        mySet2.showContents();

        SortedSet test = mySet.setIntersect(mySet2);

        test.showContents();
    }
}