package deadlock;

public class DeadLockDemo {

    public static void main(String[] args) {
        String lock_A = "A";
        String lock_B = "B";

        Thread thread1 = new Thread(() -> {
            synchronized (lock_A) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock_B) {
                    System.out.println("Lock B released");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock_B) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock_A) {
                    System.out.println("Lock A released");
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}