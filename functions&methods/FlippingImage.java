import java.util.Arrays;

class FlippingImage {

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        System.out.println(Arrays.deepToString((flipAndInvertImage(arr))));
    }

    public static int[][] flipAndInvertImage(int[][] arr) {
        int[][] reverseArr1 = reverseArr(arr);
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (reverseArr1[i][j] == 0) {
                    reverseArr1[i][j] = 1;
                } else {
                    reverseArr1[i][j] = 0;
                }
            }
        }
        return reverseArr1;

    }

    public static int[][] reverseArr(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] reverseArr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reverseArr[i][cols - 1 - j] = arr[i][j];
            }
        }
        return reverseArr;
    }
}