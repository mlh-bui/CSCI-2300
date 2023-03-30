package Wk6_MidtermPrep;

import java.util.ArrayList;

public class SetAsArrayList {
    ArrayList<String> items;

    SetAsArrayList() {
        items = new ArrayList<>();
    }

    // Uses indexOf method already in ArrayList
    // Uses less code than SetAsArray
    int indexOf(String item) {
        return items.indexOf(item);
    }

    // Similar to SetAsArray, changes not needed
    boolean hasItem(String item) {
        return indexOf(item) > -1;
    }

    // Uses add method already in ArrayList
    // Uses less code than SetAsArray
    void addItem(String item) {
        // better than having a return call in the middle of the method
        // if the item is not already in the set
        if(!hasItem(item)) {
            items.add(item);
        }
    }

    // Uses remove method already in ArrayList
    // Uses less code than SetAsArray
    void removeItem(String item) {
        // if the item is present in the set
        if(hasItem(item)) {
            items.remove(item);
        }
    }

    // Kept the same as SetAsArray
    // Can be changed to par down display but this is preference
    void showContents() {
        System.out.println("Set contains " + items.size() + " elements");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(" - Element " + i + ": " + items.get(i));
        }
    }

    // Similar to SetAsArray, uses ArrayList size method
    int size() {
        return items.size();
    }

    // Adding main to test the class to be removed after testing
    public static void main(String[] args) {
        SetAsArrayList mySet = new SetAsArrayList();
        mySet.addItem("AB");
        mySet.addItem("BA");
        mySet.addItem("CCCA");
        mySet.addItem("A");
        mySet.showContents();
        mySet.removeItem("B");
        mySet.showContents();
        mySet.addItem("D");
        mySet.showContents();
    }

}
