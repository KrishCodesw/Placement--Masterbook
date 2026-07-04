public class ReverseNumber {
    static void fun(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        System.out.println(n % 10);

        fun(n / 10);
    }

    static int revfun(int n) {
        if (n < 10) {
            return n;
        }
        int digits = (int) (Math.log10(n)) + 1; // How to calculate number of digits in an integer super IMPPPPPPPPPP
        return (n % 10 * (int) (Math.pow(10, digits - 1)) + revfun(n / 10));

    }

    public static void main(String[] args) {
        System.out.println(revfun(1253));
    }
}
// No need to return the value since the number is already outside the function