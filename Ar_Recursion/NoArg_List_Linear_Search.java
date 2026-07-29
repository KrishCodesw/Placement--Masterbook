
import java.util.ArrayList;

public class NoArg_List_Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 8 };

        int target1 = 8;

        ArrayList<Integer> l = Lsearch(arr, target1, 0); 

        System.out.println(l);

    }

    public static ArrayList<Integer> Lsearch(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> prevAns = Lsearch(arr, target, index + 1);
        list.addAll(prevAns);

        return list;
    }
}
