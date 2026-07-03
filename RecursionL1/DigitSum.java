public class DigitSum {
    public static void main(String[] args) {
        int n = 589528428;
        System.out.println(Digitsum(n));
    }
    // 134=1+3+4

    static public int Digitsum(int n) {

        if (n == 0) {
            return n;
        }

        int sum = 0;

        int rem = n % 10;
        sum += rem;
        n /= 10;

        return sum + Digitsum(n);
    }
}
