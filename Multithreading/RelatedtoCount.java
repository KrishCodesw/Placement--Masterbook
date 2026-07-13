public class RelatedtoCount {
    public static void main(String[] args) {
        Count c = new Count();

        ThreadforCount t1 = new ThreadforCount(c);
        ThreadforCount t2 = new ThreadforCount(c);
        // Sharing of resource - common object
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
