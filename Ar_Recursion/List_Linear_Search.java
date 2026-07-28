
import java.util.ArrayList;

public class List_Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 2 };

        int target1 = 8;
    }

    public ArrayList<Integer> Lsearch(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(arr[index]);
        }

        return list;
    }
}
