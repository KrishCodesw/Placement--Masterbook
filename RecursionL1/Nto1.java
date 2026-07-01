public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
        Nto1fun(n);
        Nto1funrev(n);
    }

    static void Nto1fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Nto1fun(n - 1);

    }

    static void Nto1funrev(int n) {
        if (n == 0) {
            return;
        }
        Nto1funrev(n - 1);
        System.out.println(n);

    }
}