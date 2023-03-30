package Wk7_Midterm;

//the class store strings in a array
class SetAsArray {
    String[] items;

    SetAsArray() {
        items = new String[] {};
    }

    public SetAsArray setIntersect(SetAsArray B) {
        // create set to hold intersecting values
        SetAsArray intersect = new SetAsArray();
        for(int i = 0; i < size(); i++) {
            // if set B has items in set A
            if(B.hasItem(items[i])) {
                intersect.addItem(items[i]); // add to intersect set
            }
       }
        return intersect;
    }

    int indexOf(String item) {
        // Check if item is already present
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                return i;    }
        }
        return -1;
    }

    boolean hasItem(String item) {
        return indexOf(item) > -1;
    }

    void addItem(String item) {
        if (hasItem(item)) {
            // Item already present
            return;    }

        // otherwise Make new array to create space for the new item to be inserted
        String[] newItems = new String[items.length + 1];
        // Add existing items
        System.arraycopy(items, 0, newItems, 0, items.length);
        // Add item to new array
        newItems[newItems.length - 1] = item;
        // Set new array
        items = newItems;
    }

    void removeItem(String item) {
        if (!hasItem(item)) {
            // Item not present
            return;     }
        // Make new array
        String[] newItems = new String[items.length - 1];
        // Add existing items except item to be removed
        System.arraycopy(items, 0, newItems, 0, indexOf(item)); // First half
        System.arraycopy(items, indexOf(item) + 1, newItems, indexOf(item),
                items.length - indexOf(item) - 1); // Second half
        // Set new array
        items = newItems;     }

    void showContents() {
        System.out.println("Set contains " + items.length + " elements");
        for (int i = 0; i < items.length; i++) {
            System.out.println(" - Element " + i + ": " + items[i]);
        }
    }

    int size() {
        return items.length;
    }

    //adding main to test the class to be removed after testing
    public static void main(String[] args) {
        SetAsArray mySet = new SetAsArray();
        mySet.addItem("AB");
        mySet.addItem("BA");
        mySet.addItem("CCCA");
        mySet.addItem("A");
        mySet.addItem("D");
        mySet.showContents();

        SetAsArray mySet2 = new SetAsArray();
        mySet2.addItem("AB");
        mySet2.addItem("BA");
        mySet2.addItem("CCCA");
        mySet2.addItem("CA");
        mySet2.addItem("A");
        mySet2.addItem("DH");
        mySet2.addItem("D");
        mySet2.showContents();

        SetAsArray test = mySet.setIntersect(mySet2);

        test.showContents();
    }
} //end of class definition