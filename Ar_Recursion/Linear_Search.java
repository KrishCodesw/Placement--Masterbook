public class Linear_Search {
    // arr t

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 2 };

        int target1 = 8;
        int target2 = 99;

        System.out.println("Target " + target1 + " found at index: " + Lsearch(arr, 0, target1));
        System.out.println("Target " + target2 + " found at index: " + Lsearch(arr, 0, target2));
    }

    public static int Lsearch(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return Lsearch(arr, idx + 1, target);
    }

}
