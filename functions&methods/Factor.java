public class Factor {
    public static void main(String[] args) {
        int n = 36;
        factors(n);
        factors2(n);
    }

    // O(n)
    static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

    // O(root(n))
    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i + " " + n / i);

                }
            }
        }
    }
}
