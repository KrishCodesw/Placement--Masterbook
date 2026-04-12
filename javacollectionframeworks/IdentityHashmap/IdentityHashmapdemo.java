import java.util.HashMap;

public class IdentityHashmapdemo {
    public static void main(String[] args) {
        String Key1 = new String("key");
        String Key2 = new String("key");

        HashMap<String, Integer> map = new HashMap<>();
        map.put(Key1, 1);
        map.put(Key2, 2);
        System.out.println(map);
    }
}
