import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by ruplaga on 7/31/2017.
 */
public class SumOfNumbers {

    @Test
    public void calculateSum() {
        Sum sum = new Sum();
        Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 5000; i++) {
            executor.execute(sum);
        }
    }
}

class Sum implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 500 ; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
