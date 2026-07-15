import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionExample {
    private static Lock lock = new ReentrantLock();
    private static Condition conndition = lock.newCondition();
    private static boolean ready = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                while (!ready) {
                    System.out.println("Waiting");
                    conndition.await();
                }
                System.out.println("Thread resumed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread t2 = new Thread(() -> {
            lock.lock();
            try {
                ready = true;
                System.out.println("Signaling");
                conndition.signal();
            } finally {
                lock.unlock();
            }
        });
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
