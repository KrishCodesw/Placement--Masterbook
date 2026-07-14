public class BankAccount {
    private int balance = 1000;

    public synchronized void withDraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " " + "attempting to withdraw rs" + amount);
        if (balance >= amount) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + "proceeding to withdraw rs" + amount);
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.getLogger(BankAccount.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            balance -= amount;
            System.out.println("Completed withdrawal. Remainging balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " " + "Insufficient balance to withdraw rs" + amount);

        }
    }
}
