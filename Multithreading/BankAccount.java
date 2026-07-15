import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 1000;
    private final Lock lock = new ReentrantLock();

    public void withDraw(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to withdraw rs" + amount);

        try {
            // 1. Attempt to acquire the lock with a 1000 millisecond timeout
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    // 2. Critical Section: Check balance and modify data under lock protection
                    if (balance >= amount) {
                        System.out.println(threadName + " proceeding to withdraw rs" + amount);

                        // Simulating processing time
                        Thread.sleep(3000);

                        balance -= amount;
                        System.out.println(threadName + " completed withdrawal. Remaining balance: " + balance);
                    } else {
                        System.out.println(threadName + " insufficient balance to withdraw rs" + amount);
                    }
                } finally {
                    // 3. Always release the lock in a finally block inside the successful lock
                    // block
                    lock.unlock();
                }
            } else {
                // Executed if the thread could not acquire the lock within 1000ms
                System.out.println(threadName + " could not acquire lock (Timeout).");
            }
        } catch (InterruptedException e) {
            System.err.println(threadName + " was interrupted while waiting for lock.");
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }
}
