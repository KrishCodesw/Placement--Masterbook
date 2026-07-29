public class TrianglePrinting {
    public static void main(String[] args) {
        // ****
        // ***
        // **
        // *

        // f(4,0)
        // f(3,1)
        // f(2,2)
        // f(1,3)
        // f(0,4)
        printPattern(5, 0);
        System.out.println(" ");
        // printPattern2(5, 0);
    }

    public static void printPattern(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            System.out.print("*");
            printPattern(row, col + 1);
        } else {
            System.out.println();
            printPattern(row - 1, 0);
        }

    }

    public static void printPattern2(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            printPattern2(row, col + 1);
            System.out.print("*");
        } else {
            System.out.println();
            printPattern2(row - 1, 0);
        }

    }
}