public class NumberofSteps {
    public static void main(String[] args) {
        System.out.println(erOfSteps(75));
    }

    static public int erOfSteps(int num) {
        return helper(num, 0);
    }

    static public int helper(int num, int c) {
        if (num == 0) {
            return c;
        }
        if (num % 2 == 0) {
            return helper(num / 2, c + 1);
        } else {

            return helper(num - 1, c + 1);
        }

    }
}
