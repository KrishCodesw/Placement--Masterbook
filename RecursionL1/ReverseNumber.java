public class ReverseNumber {
    static void fun(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        System.out.println(n % 10);

        fun(n / 10);
    }

    static void revfun(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        int digits = (int) (Math.log10(n)) + 1; // How to calculate number of digits in an integer super IMPPPPPPPPPP
    }
}
// No need to return the value since the number is already outside the function