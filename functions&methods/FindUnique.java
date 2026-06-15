public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4 };
        int unique = findUnique(arr);
        System.out.println("The unique element is " + unique);
    }

    private static int findUnique(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
