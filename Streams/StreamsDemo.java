import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 45, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
        // Above is called imperative programming
        // Below is called declarative programming
        int[] arr2 = { 1, 2, 3, 4, 45, 5, 6, 7, 8, 9, 10 };
        Arrays.stream(arr2);
        int sum2 = Arrays.stream(arr2).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);

        // Implementation of stream
        List<String> names = Arrays.asList("Shubham", "Shivam", "Satyarth", "Shivansh");
        Stream<String> nameS = names.stream();

        Stream<Integer> nums = Stream.of(1, 2, 34, 67, 8, 8, 8, 9, 9);
        // Stream.iterate(0, n -> n + 1); // Will print infinite numbers starting from 0
        // and incrementing by 1
        Stream<Integer> numeee = Stream.iterate(0, n -> n + 1).limit(100); // Will print infinite numbers starting from
                                                                           // 0 and incrementing by 1
        // Stream<Integer> namess = Stream.generate((int)->Math.random()*100).limit(15);
    }
}
