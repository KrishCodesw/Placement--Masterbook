import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        int[] newarr = MergeSortFunc(arr);
        System.out.println(Arrays.toString(newarr));
    }

    public static int[] MergeSortFunc(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = MergeSortFunc(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSortFunc(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] arr, int[] arr2) {
        int[] combined = new int[arr.length + arr2.length];

        int i = 0; // for arr
        int j = 0; // for arr2
        int k = 0; // for combined
        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                combined[k] = arr[i];
                i++;
            } else {
                combined[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr.length) {
            combined[k] = arr[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            combined[k] = arr2[j];
            j++;
            k++;
        }
        return combined;

    }
}
