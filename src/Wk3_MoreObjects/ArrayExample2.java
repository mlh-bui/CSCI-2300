package Wk3_MoreObjects;// 2/2 In-class exercises
//
// COMP 313 - Marissa Bui

import java.util.Arrays;
public class ArrayExample2 {
    /**
     * Method to remove duplicates in an array
     * by creating a temporary array to hold values
     *
     * @param arr
     * @param count
     * @return length of new (non-duplicate) array
     */
    public static int mystery(int arr[], int count){
        // checking to see if there is multiple values in array
        // i.e cannot have duplicates if there is only one value
        if (count==0 || count==1){
            return count;
        }

        // create temporary array to hold values
        int[] temp = new int[count];
        int j = 0;
        for (int i=0; i<count-1; i++){
            // if int at position 1 != 2
            if (arr[i] != arr[i+1]){
                //temporary array holds value
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[count-1];

        // put temporary values into arr[]
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
    public static void main (String[] args) {
        int arr[] = {3, 2, 1, 2, 9, 10, 4, 10, 9};

        // sort array before finding duplicates
        Arrays.sort(arr);
        int length = arr.length;

        // print original array
        System.out.print("Original Array: ");
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");

        length = mystery(arr, length);

        System.out.println("");

        // print arrays after method to get rid of duplicates
        System.out.print("Array after changes: ");
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}