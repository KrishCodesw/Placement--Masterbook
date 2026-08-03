import java.util.concurrent.atomic.AtomicReference;

public class Lock_Free_Concurrency {

    public static void main(String[] args) throws InterruptedException {
        LikeCounter counter = new LikeCounter();

        // Thread 1 increments the counter 10,000 times
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.like();
            }
        });

        // Thread 2 increments the counter 10,000 times
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.like();
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Display final count (should be exactly 20000)
        System.out.println("Final Like Count: " + counter.getCount());
    }

    // Changed to 'static' so it can be instantiated inside the static main method
    public static class LikeCounter {
        private final AtomicReference<Integer> totalCount = new AtomicReference<>(0);

        public void like() {
            // Your spin-lock logic using Compare-And-Swap (CAS)
            while (true) {
                Integer currentCount = totalCount.get();
                Integer finalCount = currentCount + 1;

                // Atomically updates only if the value didn't change in between
                if (totalCount.compareAndSet(currentCount, finalCount)) {
                    return;
                }
            }
        }

        public Integer getCount() {
            return totalCount.get();
        }
    }
}
