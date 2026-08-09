
import java.util.concurrent.CompletableFuture;

public class CompletableFut {
    public static void main(String[] args) {
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        try {
            System.out.println(f1.get( ));
        } catch (Exception e) {

        }
    }
}