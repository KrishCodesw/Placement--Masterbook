import java.util.concurrent.atomic.AtomicReference;

public class Lock_Free_Concurrency {
  public static void main(String[] args) {

  }

  public class LikeCounter {
    AtomicReference<Integer> totalCount = new AtomicReference<>(0);

    // public void like() {
    // totalCount.set(totalCount.get() + 1);
    // }

    // get is an atomic method and .set is also atomic but they have a gap in b/w
    // and if context switch
    // happens, race condition can occur.

    while(true)
    {
      Integer currentCount = totalCount.get();

      Integer finalCount = currentCount + 1;
      if (totalCount.compareAndSet(currentCount, finalCount)) {
        return;
      }
    }

  }

}}