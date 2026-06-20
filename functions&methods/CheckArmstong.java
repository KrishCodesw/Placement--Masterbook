public class CheckArmstong {
    public boolean isArmstrong(int n) {
        int sum = 0;
        int og = n;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }
        return og == sum;
    }
}