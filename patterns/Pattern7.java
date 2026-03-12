public class Pattern7 {
    public static void main(String[] args) {
        Pattern(5);
    }

    static void Pattern(int n) {
        // outer loop will run 2n times
        for (int row = 0; row <= 2 * n; row++) {
            int totalColsinRow = row > n ? 2 * n - row : row;
            int noofSpaces = n - totalColsinRow;
            for (int j = 0; j <= noofSpaces; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsinRow; col++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 */