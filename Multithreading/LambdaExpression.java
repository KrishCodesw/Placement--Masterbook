public class LambdaExpression {
    // public static void main(String[] args) {
    // Runnable runnable = new Runnable() {
    // @Override
    // public void run() {
    // System.out.println("hello");
    // }
    // };
    // Thread t1 = new Thread(runnable);
    // t1.start();
    // }
    public static void main(String[] args) {
        // Runnable runnable = () -> System.out.println("hello");
        // Thread t1 = new Thread(runnable);
        // t1.start();

        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });
        // Implementation class of runnable
        // () -> {
        // System.out.println("Hello");
        // }

        t1.start();
    }
}
