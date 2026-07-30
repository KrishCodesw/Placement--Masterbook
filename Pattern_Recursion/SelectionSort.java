public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        SortS(arr, arr.length - 1, 0, 0);

        // Print to verify
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void SortS(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col <= row) {
            if (arr[col] > arr[max]) {
                SortS(arr, row, col + 1, col);
            } else {
                SortS(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row];
            arr[row] = temp;

            SortS(arr, row - 1, 0, 0);
        }
    }
}