public class NewtonRaphson {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    private static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = (x + (n / x)) / 2;
            double error = Math.abs(root - x);
            // can do it 0.5 as well
            if (error < 1) {
                break;
            }
            x = root;
        }
        return root;
    }
}
