package Wk6_MidtermPrep;

public class ExampleTime {
    public void testAddArrayList() {
        SetAsArrayList mySet = new SetAsArrayList();
        for (int i = 0; i <= 10000; i++) {
            mySet.addItem(i + "");
        }
    }

    public void testAddArray() {
        // Arrays are faster to add, remove = slower
        // drawback of size <-- cannot increase
        SetAsArray mySet = new SetAsArray();
        for (int i = 0; i <= 10000; i++) {
            mySet.addItem(i + "");
        }
    }

    public static void main(String args[]) {
        ExampleTime obj = new ExampleTime();
        long start1 = System.currentTimeMillis();
        obj.testAddArray();
        long end1 = System.currentTimeMillis();
        System.out.println("Elapsed Time for Array in milli seconds: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        obj.testAddArrayList();
        long end2 = System.currentTimeMillis();
        System.out.println("Elapsed Time for ArrayList in milli seconds: " + (end2 - start2));
    }
}
