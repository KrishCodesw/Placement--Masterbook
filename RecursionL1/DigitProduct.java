public class DigitProduct {

    public static void main(String[] args) {
        System.out.println(DigitPro(1548));
    }

    static public int DigitPro(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * DigitPro(n / 10);
    }

}
