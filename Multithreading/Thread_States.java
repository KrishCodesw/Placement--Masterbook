public class Thread_States extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState() + " " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_States t1 = new Thread_States();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState() + " " + t1.getName());
        System.out.println(Thread.currentThread().getState() + " " + Thread.currentThread().getName());
        Thread.sleep(100);

    }
}

// Output:
// NEW
// RUNNABLE Hello
// RUNNABLE Thread-0
// RUNNABLE main
