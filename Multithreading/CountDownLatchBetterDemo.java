
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchBetterDemo {
    public class AppStart {
        static class ServiceInit implements Runnable {
            private final String serviceName;
            private final CountDownLatch latch;
            private final int startuPTime;

            public ServiceInit(String name, CountDownLatch latch, int time) {
                this.serviceName = name;
                this.latch = latch;
                this.startuPTime = time;
            }

            @Override
            public void run() {
                try {
                    System.out.println("Starting" + serviceName + "...");
                    Thread.sleep(startuPTime);
                    System.out.println("Service " + serviceName + "is up");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    latch.countDown();
                }
            }
        }
    }

    public static void main(String[] args) {
        int noOfServices = 3;
        CountDownLatch startuplatch = new CountDownLatch(noOfServices);
        ExecutorService executor = Executors.newFixedThreadPool(noOfServices);
        System.out.println("Main app starting");

        executor.submit(new AppStart.ServiceInit("Database", startuplatch, 2000));
        executor.submit(new AppStart.ServiceInit("API", startuplatch, 5000));
        executor.submit(new AppStart.ServiceInit("Redis", startuplatch, 7000));
        try {
            // 3. The Main Thread Waits
            System.out.println("Main Application waiting for services to boot up...");

            // This blocks the main thread until the latch count reaches exactly 0
            startuplatch.await();

            System.out.println("All services are fully initialized! Application is now ready to accept traffic.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Application initialization was interrupted.");
        } finally {
            executor.shutdown();
        }

    }
}
