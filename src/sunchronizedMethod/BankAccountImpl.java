package sunchronizedMethod;

public class BankAccountImpl {

    public static void main(String[] args) {
          BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            account.withdraw(700);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            account.withdraw(700);
        }, "Thread-2");

        t1.start();
        t2.start();

    }



}


