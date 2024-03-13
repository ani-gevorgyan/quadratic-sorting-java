import java.util.Arrays;

/*
* The insertion sort algorithm proceeds by considering one element at a time,
* placing (inserting) the element in the correct position relative to those before it.
*
* 1. First element—trivially sorted by itself
* 2. Second element: if it is smaller than the first, swap them
* 3. Third element: swap it leftward until in its proper place
* 4. Continue in this way until the entire array is sorted
* */

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 8, 2, 6, 4, 9, 7, 1 };
        int[] sortedArray = sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sort(int[] array) {
        for(int i=0; i<array.length; i++) {
            int cur = array[i];
            int j = i;

            while(j>0 && array[j-1] > cur) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = cur;
        }
        return array;
    }
}
