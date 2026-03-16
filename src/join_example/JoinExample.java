package join_example;

public class JoinExample {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Still Writing Exam");
        });

        t1.start();
        t1.join();
        System.out.println("You are ready to go with your friend");  // main or current thread  ---> Waiting state
    }
}