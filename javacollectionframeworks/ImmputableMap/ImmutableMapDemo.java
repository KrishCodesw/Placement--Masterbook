import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, String> mutableMap = new HashMap<>();
        mutableMap.put("USA", "North America");

        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(mutableMap);
        try {
            unmodifiableMap.put("Canada", "North America");
            System.out.println("No exception thrown (unexpected)");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception caught as expected");
        }

    }

}
