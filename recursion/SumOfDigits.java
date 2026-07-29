public class SumOfDigits {
    public static int SumOfDig(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + SumOfDig(n / 10);

    }
}
