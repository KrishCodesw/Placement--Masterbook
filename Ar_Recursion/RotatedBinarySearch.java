public class RotatedBinarySearch {
    // Conditions for Rotated binary search
    // if arr[s]<=arr[mid]
    // if key>=arr[s] && <=arr[mid]
    // end=mid-1
    // else
    // s=m+1
    // case 2 - where arr[start]>arr[mid]
    // key>=arr[mid] && arr[e]
    // s=mid+1
    // else
    // e=mid-1
    public static void main(String[] args) {
        int[] arr = { 5, 6, 6, 7, 10, 1, 2, 3 };
        int key = 7;

        System.out.println("Found at index: " + Lsearch(arr, key, 0, arr.length - 1));
    }

    public static int Lsearch(int[] arr, int key, int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[start] <= arr[mid]) {
            if (key >= arr[start] && key <= arr[mid]) {
                return Lsearch(arr, key, start, mid - 1);
            } else {
                return Lsearch(arr, key, mid + 1, end);
            }
        } else if (key >= arr[mid] && key <= arr[end]) {
            return Lsearch(arr, key, mid + 1, end);
        } else {
            return Lsearch(arr, key, start, mid + 1);
        }

    }
}
