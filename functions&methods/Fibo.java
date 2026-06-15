public class Fibo {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(fib(n));

    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return (int) (Math.pow((1 + Math.sqrt(5)) / 2, n) / Math.sqrt(5) + 0.5);
        // (Math.pow((1 + Math.sqrt(5)) / 2, n) = GOlDEN RATIO
        // we divide by sqrt(5) to get the nth Fibonacci number and add 0.5 for rounding
        // this method is efficient and works in O(1) time complexity
        // but it may not be accurate for large n due to floating-point precision issues
        // for large n, it is better to use iterative or dynamic programming approach to
        // avoid precision issues
    }
}
