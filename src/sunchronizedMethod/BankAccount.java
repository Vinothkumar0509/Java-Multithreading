package sunchronizedMethod;

class BankAccount {

    int balance = 1000;

    synchronized void withdraw(int amount) {

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName()
                    + " withdrawing " + amount);

            balance = balance - amount;

            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

