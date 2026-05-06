import java.util.Arrays;

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
        int sum2 = Arrays.stream(arr2).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);

    }
}
