public class Power {
    public static void main(String[] args) {
        int n = 1000;
        int b = 3;
        int power1 = Powerfunc(n, b);
        System.out.println(power1);
    }

    private static int Powerfunc(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return a;
        }
        int R = Powerfunc(a, n / 2);
        if (n % 2 == 0) {
            return R * R;
        } else {
            return R * R * a;
        }
    }

}
