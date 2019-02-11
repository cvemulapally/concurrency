package executor.callables;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args){


        for(int i=0; i<10; i++){

            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future future = executorService.submit(new CallableTask());
//            if(future.isDone()) {
                try {
                    Integer integer = (Integer) future.get(2, TimeUnit.SECONDS);
                    System.out.println("Callble task result : " + integer);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted exception.....");
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    System.out.println("Execution exception.....");
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    System.out.println("Timeout exception.....");
                    e.printStackTrace();
                }
//            } else {
//                System.out.println("future is still not done .......");
//            }

            executorService.shutdown();
        }
        System.out.println("Exiting for loop.....");
    }
}
