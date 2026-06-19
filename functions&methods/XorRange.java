public class XorRange {

    public static int XorInRange(int p, int q) {
        int XortillB = getXorSum(q);
        int XorprevA = (p == 0) ? 0 : getXorSum(p - 1);

        return XorprevA ^ XortillB;

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
