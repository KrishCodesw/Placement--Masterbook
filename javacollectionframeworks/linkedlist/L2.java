import java.util.LinkedList;

public class L2 {
        public static void main(String[] args) {
                LinkedList<Integer> linkedList = new LinkedList<>();
                linkedList.add(4);
                linkedList.add(5);
                linkedList.add(6);

                int a = linkedList.get(2);
                System.out.println(a);
                linkedList.addFirst(5);
                linkedList.addLast(7);
                linkedList.remove(2);
                linkedList.removeIf(x -> x % 2 == 0);
                System.out.println(linkedList);

        }
}