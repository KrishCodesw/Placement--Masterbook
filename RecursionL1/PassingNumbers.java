public class PassingNumbers {

    public static void main(String[] args) {

        int n = 1556;
        fun(n);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        // n-- will pass n only then subtract
        // --n will subtract first and then pass

        fun(--n);
    }

}
