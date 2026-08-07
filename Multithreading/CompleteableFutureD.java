import java.util.concurrent.CompletableFuture;

public class CompleteableFutureD {
    public static void main(String[] args) {
        CompletableFuture<Void> fire = CompletableFuture.runAsync(() -> {
            System.out.println("event");
        });
        fire.join();
    }
}