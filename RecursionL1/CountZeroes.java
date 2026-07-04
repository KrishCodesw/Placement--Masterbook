// public class CountZeroes {

// public static void main(String[] args) {
// System.out.println(CountZ(1008204, 0));
// }

// // 300258
// // 2
// static int CountZ(int n, int count) {

// if (n == 0) {
// return count;
// }

// if (n % 10 == 0) {
// return CountZ(n / 10, count + 1);
// }

// return CountZ(n / 10, count);

// }
// }

// OUR OWN APPROACH

// public class CountZeroes {

//     public static void main(String[] args) {
//         System.out.println(CountZ(1008204, 0));
//     }

//     // 300258
//     // 2
//     static int CountZ(int n, int count) {
//         if (n % 10 == 0) {
//             count++;
//         }
//         if (n < 10 && n % 10 != 0) {
//             return count;
//         }
//         return CountZ(n / 10, count);
//     }
// }

// Is this code correct and good ?