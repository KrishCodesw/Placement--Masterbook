public class Sieve {
    public static void main(String[] args) {
        int n = 42;
        boolean[] primes = new boolean[n + 1];

        sieve(n, primes);

    }

    // false in array means number is prime
    // true in array means not prime so in the for loop we will change all the
    // multiples of false to true
    private static void sieve(int n, boolean[] primes) {
        // i<=root(n) equals
        // i*i<=n
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                System.out.println(i + " ");
            }
        }
    }
}