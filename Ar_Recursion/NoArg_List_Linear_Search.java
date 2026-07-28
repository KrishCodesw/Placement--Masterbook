
import java.util.ArrayList;

public class NoArg_List_Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 8 };

        int target1 = 8;

        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (Lsearch(arr, target1, 0)) {
                l.add(i);
            }
        }

    }

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
