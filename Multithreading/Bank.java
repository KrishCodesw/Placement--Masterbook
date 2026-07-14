public class Bank {
    BankAccount bac = new BankAccount();
    Runnable task = new Runnable() {
        @Override
        public void run() {
            bac.withDraw(50);
        }
    };
    Thread t1 = new Thread(task, "thread 1");
    Thread t2 = new Thread(task, "thread 2");
}
