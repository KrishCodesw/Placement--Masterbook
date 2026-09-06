public class Minimax {

    static int minimax(int depth, int node, boolean maximizing,
                       int[] values, int alpha, int beta) {

        // Base case
        if (depth == 3) {
            return values[node];
        }

        if (maximizing) {
            int best = -9999;

            for (int i = 0; i < 2; i++) {

                int value = minimax(
                        depth + 1,
                        node * 2 + i,
                        false,
                        values,
                        alpha,
                        beta
                );

                best = Math.max(best, value);
                alpha = Math.max(alpha, best);

                // Alpha-Beta pruning
                if (beta <= alpha) {
                    break;
                }
            }

            return best;

        } else {
            int best = 9999;

            for (int i = 0; i < 2; i++) {

                int value = minimax(
                        depth + 1,
                        node * 2 + i,
                        true,
                        values,
                        alpha,
                        beta
                );

                best = Math.min(best, value);
                beta = Math.min(beta, best);

                // Alpha-Beta pruning
                if (beta <= alpha) {
                    break;
                }
            }

            return best;
        }
    }

    public static void main(String[] args) {

        int[] values = {3, 5, 6, 9, 1, 2, 0, -1};

        int result = minimax(
                0,
                0,
                true,
                values,
                -9999,
                9999
        );

        System.out.println("Final Minimax value: " + result);
    }
}