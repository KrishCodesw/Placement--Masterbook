import java.util.ArrayList;

public class AL1 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(8);
        arraylist.add(8);
        arraylist.add(8);
        arraylist.add(5);
        System.out.println(arraylist.get(3));
        System.out.println(arraylist.size());
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

        for (int x : arraylist) {
            System.out.println(x);
        }

        System.out.println(arraylist.contains(5));

        arraylist.remove(2);
        for (int x : arraylist) {
            System.out.println(x);
        }

        arraylist.add(2, 50);
        System.out.println(arraylist.get(2));

        arraylist.set(3, 50);
        System.out.println(arraylist.get(3));

    }
}