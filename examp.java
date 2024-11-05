import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable {
    private String message; // A message to print when the task is completed

    // Constructor that takes a message
    public MyRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // Simulate a long-running task
            System.out.println(message + " - Task completed by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }
}

public class examp {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService2 = Executors.newFixedThreadPool(2);

        // Creating Runnable tasks with messages
        Future<?> future1 = executorService.submit(new MyRunnable("First runnable"));
        Future<?> future4 = executorService.submit(new MyRunnable("First runnable2"));
        Future<?> future2 = executorService2.submit(new MyRunnable("Second runnable"));

        // Optional: Check if tasks are done
        System.out.println("Is future1 done? " + future1.isDone());
        System.out.println("Is future2 done? " + future2.isDone());

        // Shutdown the executor
        executorService.shutdown();
        executorService2.shutdown();
        Runtime rt = Runtime.getRuntime();
        rt.addShutdownHook(new Thread(){
            public void run(){
                System.out.print("shutdown complete");
            }
        });
        
    }
}
