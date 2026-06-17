public class NoofDigitsinBaseB {
    public static void main(String[] args) {
        int ans = CountofDigits(2, 10);
        System.out.println(ans);
        int n = 10090776;
        int b = 10;
        int ans2 = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans2);

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
