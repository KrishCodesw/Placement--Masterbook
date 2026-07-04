public class ReverseNumber {
    static void fun(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        System.out.println(n % 10);

        fun(n / 10);
    }
}
