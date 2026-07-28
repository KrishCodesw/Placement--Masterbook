public class Sorted_Array {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 34, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println("Is arr1 sorted? " + isSorted(arr1, 0));
        System.out.println("Is arr2 sorted? " + isSorted(arr2, 0));
    }

    // public static boolean isSorted(int[] arr) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // if (arr[i] > arr[i + 1]) {
    // return false;
    // }
    // }
    // return true;
    // }
    public static boolean isSorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        return arr[idx] < arr[idx + 1] && isSorted(arr, idx + 1);
    }
}
