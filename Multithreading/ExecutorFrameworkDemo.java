import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrameworkDemo {

    // no of tasks=5
    public static void main(String[] args) {

        Callable<String> call = () -> {
            return "Khatam";
        };
        ExecutorService exec = Executors.newSingleThreadExecutor();

        try {
            Future<String> futureResult = exec.submit(call);

            String result = futureResult.get();

            System.out.println(result);
        } catch (Exception e) {
        }
//----------------------------------------------------------------------------------------------------------
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i < 5; i++) {
            final int taskNumber = i;
            executor.execute(() -> {
                System.out.println("Task:" + taskNumber + "is executed by" + Thread.currentThread().getName());
            });
            // 3 tasks will wait in waiting queue
        }
        executor.shutdown();
        exec.shutdown();
    }

}