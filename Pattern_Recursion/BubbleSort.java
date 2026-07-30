public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        sortt(arr, arr.length - 1, 0);

        // Print to verify
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortt(int[] arr, int limit, int idx) {
        if (limit == 0) {
            return;
        }

        if (idx < limit) {
            if (arr[idx] > arr[idx + 1]) {
                int temp = arr[idx];
                arr[idx] = arr[idx + 1];
                arr[idx + 1] = temp;
            }
            sortt(arr, limit, idx + 1);
        } else {
            sortt(arr, limit - 1, 0);
        }
    }
}