public class QuickSortalgo {
    public static void quickSort(int[] arr, int low, int high) {
        if (arr.length <= 1) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m]; // Pivot value
        quickSort(arr, low, pivot);
        quickSort(arr, pivot, high);
    }
}
