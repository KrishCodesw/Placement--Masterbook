public class Euclidean {
    public static void main(String[] args) {
        int a = 105;
        int b = 220; // Ek dusra number bhi chahiye hoga compare karne ke liye

        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);

    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);

    }
}
