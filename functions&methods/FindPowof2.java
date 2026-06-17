public class FindPowof2 {
    public static void main(String[] args) {
        int n = 257;
        boolean ans = FindIfPowof2(n);
        System.out.println(ans);
    }

    private static boolean FindIfPowof2(int n) {
        boolean ans = false;

        

        int count = 0;
        while (n > 1) {
            n = n >> 1;
            if (n == 1) {
                count++;
            }
        }
        if (count == 1) {
            ans = true;
        }

        return ans;

    }
}
