public class LinearSearch {
    public static boolean Lsearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        if (arr[index] == target) {
            return true;
        }
        return Lsearch(arr, target, index + 1);
    }
}
