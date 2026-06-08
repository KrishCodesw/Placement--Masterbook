import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueExample {

    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> queue = new LinkedTransferQueue<>();

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer: I am trying to transfer 'Message 1'...");

                // This will block the producer until the consumer takes it
                queue.transfer("Message 1");

                System.out.println("Producer: 'Message 1' was taken! I am now free to continue.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start producer
        producer.start();

        // Let the main thread sleep to prove the producer is stuck waiting
        System.out.println("Main: Sleeping for 3 seconds. Producer should be blocked.");
        Thread.sleep(3000);

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer: I am ready to take a message.");
                String msg = queue.take(); // Takes the message, unblocking the producer
                System.out.println("Consumer: I received -> " + msg);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start consumer
        consumer.start();
    }
}