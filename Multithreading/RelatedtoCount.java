public class RelatedtoCount {
    public static void main(String[] args) {
        Count c = new Count();

        ThreadforCount t1 = new ThreadforCount(c);
        ThreadforCount t2 = new ThreadforCount(c);
        // Sharing of resource - common object between multiple threads - to make sure
        // only one method can access one object at a time
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        System.out.println(c.getCount());
    }
}
