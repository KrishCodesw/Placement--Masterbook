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

        // LAMBDA EXPRESSION KO FUNCTIONAL INTERFACE KE REFERENCE MAI DAAL SAKTE HAI
        // just like a ko int ke reference mai daalte hai
        // Implementation class of runnable
        // () -> {
        // System.out.println("Hello");
        // }

        t1.start();
    }
}
