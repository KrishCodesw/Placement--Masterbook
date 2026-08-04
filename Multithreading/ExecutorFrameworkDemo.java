import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorFrameworkDemo {

    // no of tasks=5
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i < 5; i++) {
            final int taskNumber = i;
            executor.execute(() -> {
                System.out.println("Task:" + taskNumber + "is executed by" + Thread.currentThread().getName());
            });
            // 3 tasks will wait in waiting queue
        }
    }

}