public class MagicNumber {
    public static void main(String[] args) {

        int n = 6;
        int ans = Magic(n);
        System.out.println(ans);

    }

    private static int Magic(int n) {
        int magic = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            magic += last * base;
            base = base * 5;
        }

        return magic;

    }
}