public class XorShortcut {
    public static void main(String[] args) {
        System.out.println(getXorSum(1000003));
    }

    public static int getXorSum(int a) {

        int remainder = a % 4;

        switch (remainder) {
            case 0:
                return a;
            case 1:
                return 1;
            case 2:
                return a + 1;
            default:
                return 0;
        }
    }
}
