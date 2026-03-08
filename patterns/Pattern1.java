public class Pattern1 {

    public static void main(String[] args) {
        Patternno1(3);
    }

    static void Patternno1(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

// *
// * *
// * * *
// * * * *