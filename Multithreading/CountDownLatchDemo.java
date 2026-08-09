
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public class Worker implements Runnable {
        private List<String> outputScraper;
        private CountDownLatch countDownLatch;

        public Worker(List<String> outputScraper, CountDownLatch countDownLatch) {
            this.outputScraper = outputScraper;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            doSomeWork();
            outputScraper.add("Counted down");
            countDownLatch.countDown();
        }

        public void doSomeWork() {
            int result = 1;
            for (int i = 9; i < 100000; i++) {
                result = result * i;
            }
        }
    }
}
