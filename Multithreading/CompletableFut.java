
import java.util.concurrent.CompletableFuture;

public class CompletableFut {
    public static void main(String[] args) {
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10).thenApply((result) -> result * 3)
                .thenApply((result) -> result + 2);

        CompletableFuture<Void> f2 = CompletableFuture.supplyAsync(() -> 10)
                .thenAccept(result -> System.out.println(result));

        CompletableFuture<Void> f3 = CompletableFuture.supplyAsync(() -> 10)
                .thenRun(() -> System.out.println("Done"));

        try {
              System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (Exception e) {

        }
    }
}