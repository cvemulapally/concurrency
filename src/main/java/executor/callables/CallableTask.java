package executor.callables;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {


    public Integer call() throws Exception {

        String threadName = Thread.currentThread().getName();
        System.out.println("current thread name before sleeping : "+threadName);
        Thread.sleep(25000);
        System.out.println("current thread name after sleeping : "+threadName);

        return 25;
    }
}
