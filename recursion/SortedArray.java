public class SortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 45, 57, 67, 88 };
        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return isSorted(arr, index + 1);
        }
        return false;
    }
}
