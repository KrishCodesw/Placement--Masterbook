
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.logging.Logger;

public class ForkJoin {
    public static void main(String[] args) {
        // ways to initialize a fork join pool

        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        String largeWorkload = "LEARNINGFORKJOINPOOL";
        CustomRecursiveAction mainActionTask=new CustomRecursiveAction(largeWorkload);
        forkJoinPool.invoke(mainActionTask);

    }

    public static ForkJoinPool forkJoinPool = new ForkJoinPool(2);

    public static class CustomRecursiveAction extends RecursiveAction {
        private String workload = "";
        private static final int THRESHOLD = 4;
        private static Logger logger = Logger.getAnonymousLogger();

        public CustomRecursiveAction(String workload) {
            this.workload = workload;
        }

        @Override
        public void compute() {
            if (workload.length() > THRESHOLD) {
                ForkJoinTask.invokeAll(createSubtasks());
            } else {
                processing(workload);
            }

        }

        private List<CustomRecursiveAction> createSubtasks() {
            List<CustomRecursiveAction> subtasks = new ArrayList<>();
            String partOne = workload.substring(0, workload.length() / 2);
            String partTwo = workload.substring(workload.length() / 2, workload.length());
            subtasks.add(new CustomRecursiveAction(partOne));
            subtasks.add(new CustomRecursiveAction(partTwo));
            return subtasks;

        }

        private void processing(String work) {
            String result = work.toUpperCase();
            logger.info("This result - (" + result + ") - was processed by "
                    + Thread.currentThread().getName());
        }
    }
}
