import java.util.Arrays;

/*
* To sort a sequence S with n elements, merge sort does:
    1. Divide: If |S| ≤ 1, return S. Otherwise, partition S into S1 with ⌊n2⌋ elements, and S2 with ⌈n2⌉ elements.
    2. Conquer: Recursively sort sequences S1 and S2.
    3. Combine: Merge the sorted sequences S1 and S2 into a unique sorted sequence.
    *
    * Running Time: O(nlog(n))
* */

public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 8, 2, 6, 4, 9, 7, 1 };
        mergeSort(array);
        System.out.println("sorted array: " + Arrays.toString(array));
    }
    public static void mergeSort(int[] array) {
        int n = array.length;
        int mid = n / 2;
        if(n<2) return;

        int[] arr1 = Arrays.copyOfRange(array, 0, mid);
        int[] arr2 = Arrays.copyOfRange(array, mid, n);
        mergeSort(arr1);
        mergeSort(arr2);

        merge(arr1, arr2, array);
    }

    public static void merge(int[] arr1, int[] arr2, int[] array) {
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("array: " + Arrays.toString(array));
        int i=0, j=0, k=0;
        while(i<array.length) {
            if(k==arr2.length || j<arr1.length && arr1[j] < arr2[k]) {
                array[i] = arr1[j];
                j++;
            } else {
                array[i] = arr2[k];
                k++;
            }
            i++;
        }
    }
}