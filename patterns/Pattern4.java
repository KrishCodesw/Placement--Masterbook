public class Pattern4 {

    public static void main(String[] args) {
        Pattern(5);
    }

    static void Pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) { // How n-row+1 ? -->
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Step 1: Identify the no. of rows
// Step 2: Identify the no. of columns and the type of it
// Step 3: What do you need to print
// Step 4: Try to find the formula relating rows and columns

// * * * * *
// * * * *
// * * *
// * *
// *