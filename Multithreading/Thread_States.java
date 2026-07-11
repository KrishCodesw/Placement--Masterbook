public class Thread_States extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState() + " " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread_States t1 = new Thread_States();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState() + " " + t1.getName());
        System.out.println(Thread.currentThread().getState() + " " + Thread.currentThread().getName());

    }
}

// Output:
// NEW
// RUNNABLE Hello
// RUNNABLE Thread-0
// RUNNABLE main
