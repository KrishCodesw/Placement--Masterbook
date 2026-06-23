public class Euclidean {
    public static void main(String[] args) {
        int a = 105;
        int b = 220; // Ek dusra number bhi chahiye hoga compare karne ke liye

        int result = lcm(a, b);
        int result2 = gcd(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + result);
        System.out.println("GCD of " + a + " and " + b + " is: " + result2);

    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);

    }

    static int lcm(int a, int b) {
        if (a == 0) {
            return b;
        }
        return (a * b) / gcd(b % a, a);

    }
}
