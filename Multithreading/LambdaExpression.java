public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
