
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ALExttra {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "banana", "Mango");
        System.out.println(list);
        list.sort(new StringLengthComparator());
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;

        // The integer that this compare method is returning is -
        // Ascending order in o1,o2
        // 1. negative ---- o1 should come before and o2 should come after 3-5=-2
        // 2. positive ---- o2 should come after o1 and o1 should come before 5-3=2

        // let's take o1=5, o2=3 and we want them in descending order ; that means as it
        // is ; o1 should come before o2 ; result negative
        // --- > o2-o1 will be the condition for descending
        // Comparator done

        Comparator<Integer> comp = Comparator.comparing(o1);
    }
}
