
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.logging.Logger;

public class ForkJoin {
    public static void main(String[] args) {
        // ways to initialize a fork join pool

        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        String largeWorkload = "LEARNINGFORKJOINPOOL";
        CustomRecursiveAction mainActionTask = new CustomRecursiveAction(largeWorkload);
        forkJoinPool.invoke(mainActionTask);

        int[] sampleArray = new int[30];
        Arrays.fill(sampleArray, 15);
        CustomRecursiveTask mainRecursiveTask = new CustomRecursiveTask(sampleArray);
        Integer result = forkJoinPool.invoke(mainRecursiveTask);

        System.out.println("Final Stream Result from Tasks: " + result);

    }

    public static ForkJoinPool forkJoinPool = new ForkJoinPool(2);

    // ____________________ RECURSIVE ACTION__________________________

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
    // ____________________ RECURSIVE TASK__________________________

    public static class CustomRecursiveTask extends RecursiveTask<Integer> {
        private int[] arr;

        private static final int THRESHOLD = 20;

        public CustomRecursiveTask(int[] arr) {
            this.arr = arr;
        }

        @Override
        protected Integer compute() {
            if (arr.length > THRESHOLD) {
                return ForkJoinTask.invokeAll(createSubtasks()).stream().mapToInt(ForkJoinTask::join).sum();
            } else {
                return processing(arr);
            }
        }

        private List<CustomRecursiveTask> createSubtasks() {
            List<CustomRecursiveTask> dividedTasks = new ArrayList<>();
            dividedTasks.add(new CustomRecursiveTask(
                    Arrays.copyOfRange(arr, 0, arr.length / 2)));
            dividedTasks.add(new CustomRecursiveTask(
                    Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
            return dividedTasks;
        }

        private Integer processing(int[] arr) {
            return Arrays.stream(arr)
                    .filter(a -> a > 10 && a < 27)
                    .map(a -> a * 10)
                    .sum();
        }
    }

}
