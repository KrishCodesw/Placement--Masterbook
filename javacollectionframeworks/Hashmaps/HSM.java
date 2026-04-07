import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HSM {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Student1");
        hmap.put(2, "Student2");
        hmap.put(3, "Student3");
        System.out.println(hmap);
        String su = hmap.get(3);
        System.out.println(su);
        // if no roll no then null returned
        System.out.println(hmap.containsKey(2));
        System.out.println(hmap.containsValue("Student1"));

        for (int i : hmap.keySet()) {
            System.out.println(hmap.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hmap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            entry.setValue(entry.getValue().toLowerCase());
            System.out.println(hmap);
        }
    }
}
