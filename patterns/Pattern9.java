public class Pattern9 {
    public static void main(String[] args) {
        Pattern(4);
    }

    static void Pattern(int n) {
        int Orignaln = n;
        n = 2 * n;
        // total rows=2n-1
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int ateveryidx = Orignaln - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                // int ateveryidx = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(ateveryidx + " ");
            }
            System.out.println();
        }
    }
}

//
/*
 * 4 4 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 3 3 4
 * 4 3 2 2 2 2 2 3 4
 * 4 3 2 1 1 1 2 3 4
 * 4 3 2 1 0 1 2 3 4
 * 4 3 2 1 1 1 2 3 4
 * 4 3 2 2 2 2 2 3 4
 * 4 3 3 3 3 3 3 3 4
 * 4 4 4 4 4 4 4 4 4
 */