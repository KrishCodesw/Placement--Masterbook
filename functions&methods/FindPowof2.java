// public class FindPowof2 {
//     public static void main(String[] args) {
//         int n = 257;
//         boolean ans = FindIfPowof2(n);
//         System.out.println(ans);
//     }

//     private static boolean FindIfPowof2(int n) {
//         boolean ans = true;

//         if (n <= 0) {
//             return false;
//         }
//         while (n > 1) {
//             if ((n & 1) != 0) {
//                 ans = false;
//             }
//             n = n >> 1;
//         }

//         return ans;

//     }
// }

public class FindPowof2 {
    public static void main(String[] args) {
        int n = 0;
        boolean ans = FindIfPowof2(n);
        System.out.println(ans);
    }

    private static boolean FindIfPowof2(int n) {
        boolean ans = true;

        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if ((n & 1) != 0) {
                ans = false;
            }
            n = n >> 1;
        }

        return ans;

    }
}
