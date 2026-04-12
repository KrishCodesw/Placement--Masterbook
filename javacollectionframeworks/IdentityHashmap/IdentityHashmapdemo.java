import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmapdemo {
    public static void main(String[] args) {
        String Key1 = new String("key"); // iska address alag
        String Key2 = new String("key"); // iska address bhi alag

        HashMap<String, Integer> map = new HashMap<>();
        map.put(Key1, 1); // key,1
        map.put(Key2, 2); // key,2
        // Equal nahi hai toh collision aayega and agar equal hai toh replace hojeaga
        // Equal will be checked with equals() method se
        System.out.println(Key1.equals(Key2));

        System.out.println(map);

        IdentityHashMap<String, Integer> map1 = new IdentityHashMap<>();
        map.put(Key1, 1); // key,1
        map.put(Key2, 2); // key,2

        // The Identity Hashmap uses the hashCode function of the Object class itself
        // and not of the String class which means the hashcode depends on the memory
        // address and the hashcode will differ and the bucket will store it in
        // different index
        // Identity hashcode and == Content will not be checked , reference will be
        // checked
        System.out.println(System.identityHashCode(Key1));
        System.out.println(Key1.hashCode());
    }
}
