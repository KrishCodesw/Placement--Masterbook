public class NumbersExample {
    public static void main(String[] args) {
        NumbersExample1(1);
    }

    static void NumbersExample1(int n) {
        System.out.println(n);
        NumbersExample2(n + 1);
    }

    static void NumbersExample2(int n) {
        System.out.println(n);
        NumbersExample3(n + 1);
    }

    static void NumbersExample3(int n) {
        System.out.println(n);
        NumbersExample4(n + 1);
    }

    static void NumbersExample4(int n) {
        System.out.println(n);
        NumbersExample5(n + 1);
    }

    static void NumbersExample5(int n) {
        System.out.println(n);
    }

}
