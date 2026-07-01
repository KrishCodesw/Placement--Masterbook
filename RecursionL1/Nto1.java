public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
        Nto1fun(n);
    }

    static void Nto1fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Nto1fun(n - 1);
        if (n == 1) {
            System.out.println(1);
            return;
        }

    }
}