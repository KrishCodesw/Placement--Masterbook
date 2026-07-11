public class Thread_methods extends Thread {
    @Override
    public void run() {
        // System.out.println("Thread is running");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ehllo"); // will print after 5 seconds
        // for (int i = 0; i <= 5; i++) {
        // try {
        // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        // throw new RuntimeException(e);
        // }
        // System.out.println(i);
        // }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_methods t1 = new Thread_methods();
        t1.start();
        t1.join(); // main method is waiting ki kab t1 khatam ho, tabhi aage badhu
    }
}
