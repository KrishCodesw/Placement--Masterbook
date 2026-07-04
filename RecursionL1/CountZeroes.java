public class CountZeroes {

    public static void main(String[] args) {
        System.out.println(CountZ(1008204, 0));
    }

    // 300258
    // 2
    static int CountZ(int n, int count) {
        if (n % 10 == 0) {
            count++;
        }
        if (n < 10 && n % 10 != 0) {
            return count;
        }
        return CountZ(n / 10, count);
    }
}
