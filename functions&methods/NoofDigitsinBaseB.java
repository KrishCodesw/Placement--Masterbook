public class NoofDigitsinBaseB {
    public static void main(String[] args) {
        int ans = CountofDigits(2, 10);
        System.out.println(ans);
    }

    private static int CountofDigits(int b, int n) {

        int count = 0;
        int number = n;
        while (number > 0) {
            number = number >> 1;
            count++;
        }
        return count;

    }
}
