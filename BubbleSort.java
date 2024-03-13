import java.util.Arrays;
/*
* Keep passing through the array,
* swapping adjacent elements that are out of order, continuing until the array is sorted.
* Assume at each outer pass, we ‘bubble’ from the beginning of the array to its end.
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 8, 2, 6, 4, 9, 7, 1 };
        int[] sortedArray = sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sort(int[] array) {
        for(int i=0; i<array.length; i++) {
            for(int j=0; j < array.length - 1; j++) {
                //checking the relationship of the adjacent elements
                if(array[j] > array[j+1]) {
                    //swapping if the previous element is larger than the next one
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
