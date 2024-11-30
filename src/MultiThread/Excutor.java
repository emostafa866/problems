package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()-> System.out.println("task1 executed"));
        executorService.execute(()-> System.out.println("task2 executed"));

        executorService.shutdown();

    }
}
