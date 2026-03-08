public class LearningThreads {
    public static void main(String args[]) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println("... Multithreading is over ");

        try {
            a.join();
            b.join();
            c.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread A with i = " + -1 * i);
        }
        System.out.println("Exiting from Thread A ...");
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread B with j= " + 2 * j);
        }
        System.out.println("Exiting from Thread B ...");
    }
}

class ThreadC extends Thread {
    public void run() {
        for (int k = 0; k <= 500; k++) {
            System.out.println("THreadC hi kehde" + (2 + k));
        }
        System.out.println("Bye hai Ji");
    }
}

class THreadX implements Runnable {
    public void run() {
        for (int k = 0; k <= 500; k++) {
            System.out.println("THreadC hi kehde" + (2 + k));
        }
        System.out.println("Bye hai Ji");
    }
}
