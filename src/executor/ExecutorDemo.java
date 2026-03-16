package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {
        int limit = 1000;
        // Single thread -> Executors.newSingleFixedThreadPool()
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long startTime = System.currentTimeMillis();
        for(int i=1; i<=limit; i++) {
            executorService.execute(() -> {
                System.out.println("task executed by -> "+ Thread.currentThread().getName());
            });
        }

        System.out.println(System.currentTimeMillis() - startTime);
        executorService.shutdown();
    }
}