
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantEx {
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outer");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantEx re = new ReentrantEx();
        re.outerMethod(); 
    }
}
