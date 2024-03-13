import java.util.Arrays;

/*
* The selection sort algorithm works as follows:

1. Find (select) the smallest element in the array, and exchange it with the element in the first position
2. Find the second smallest element and exchange it with the element in the second position
3. Continue in this way until the entire array is sorted
* */

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 8, 2, 6, 4, 9, 7, 1 };
        int[] sortedArray = sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
    public static int[] sort(int[] array) {
        for(int i=0; i<array.length; i++) {
            int min = i;
            for(int j=i; j<array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
                System.out.println("Smallest is: " + min);
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }
}
