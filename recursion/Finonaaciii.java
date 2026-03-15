public class Finonaaciii {
    public static void main(String[] args) {
        // int first = 0;
        // int second = 1;
        // System.out.println(first);
        // System.out.println(second);
        // FSeries(580);
        System.out.println(FSeries(1253));
    }

    static int FSeries(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return FSeries(n - 1) + FSeries(n - 2);

    }
}
// public class Finonaaciii {
// public static void main(String[] args) {
// int first = 0;
// int second = 1;
// System.out.println(first);
// System.out.println(second);
// FSeries(first, second, 580);
// }

// static void FSeries(int first, int second, int n) {

// int sum = first + second;

// if (sum > n) {
// return;
// }
// System.out.println(sum);

// FSeries(second, sum, n);
// }
// }
