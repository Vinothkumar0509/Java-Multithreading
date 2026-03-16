package future_callable;

import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<?> task = () -> {
            Thread.sleep(3000);
            return 10;
        };

        Future<?> future = executorService.submit(task);

        System.out.println("Working in other tasks!!!");
        // It will wait until the task completed
        System.out.println(future.get());

        executorService.shutdown();
    }
}