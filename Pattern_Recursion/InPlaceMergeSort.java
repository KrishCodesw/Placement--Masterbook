public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        MergeSortInPlaceFunc(arr, 0, arr.length);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void MergeSortInPlaceFunc(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (e - s) / 2 + s;
        MergeSortInPlaceFunc(arr, s, mid);
        MergeSortInPlaceFunc(arr, mid, e);
        merge(arr, s, mid, e);
    }

    public static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
                k++;
            } else {
                mix[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int n = 0; n < mix.length; n++) {
            arr[s + n] = mix[n];
        }
        // System.arraycopy(mix, 0, arr, s, mix.length);
    }

}
