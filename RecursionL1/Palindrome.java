public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palin(2222));
    }

    static boolean Palin(int n) {

        return n == revfun(n);

    }

    static int revfun(int n) {
        if (n < 10) {
            return n;
        }
        int digits = (int) (Math.log10(n)) + 1; // How to calculate number of digits in an integer super IMPPPPPPPPPP
        return (n % 10 * (int) (Math.pow(10, digits - 1)) + revfun(n / 10));

    }
}
