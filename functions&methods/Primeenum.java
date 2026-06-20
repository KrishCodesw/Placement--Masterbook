public class Primeenum {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(17));
        System.out.println(isPrime(9));
        System.out.println(isPrime(19));
        System.out.println(isPrime(25));
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}