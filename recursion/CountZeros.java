public class CountZeros {
    public static void main(String[] args) {

    }

    public static int countZeros(int n) {
        if (n == 0) {
            return n;
        }
        if (n % 10 == 0) {
            return 1 + countZeros(n / 10);
        } else {
            return countZeros(n / 10);
        }
    }
}