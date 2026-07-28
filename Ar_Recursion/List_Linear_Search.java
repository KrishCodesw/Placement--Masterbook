
import java.util.ArrayList;

public class List_Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 8 };

        int target1 = 8;

        System.out.println(Lsearch(arr, target1, 0));
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> Lsearch(int[] arr, int target, int index) {

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(arr[index]);
            return list;
        }
        return Lsearch(arr, target, index + 1);
    }
}
