public class LSHM {
    public static int hashCode(int a[]) {
        if (a == null)
            return 0;

        int result = 1;
        for (int element : a)
            result = 31 * result + element;

        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 7, 52, 8, 8, 2, 4 };
        int hashcodeA = hashCode(a);
        System.out.println(hashcodeA);

    }
}
