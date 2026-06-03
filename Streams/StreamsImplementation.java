
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

public class StreamsImplementation {
    public static void main(String[] args) {
        List<List<String>> newLi = Arrays.asList(
                Arrays.asList("aa", "bb"),
                Arrays.asList("cc", "dd"),
                Arrays.asList("ee", "ff"));
        Stream updatedLi = newLi.stream().flatMap(Collection::stream).map(String::toUpperCase);
        System.out.println(updatedLi.toList());
    }

}